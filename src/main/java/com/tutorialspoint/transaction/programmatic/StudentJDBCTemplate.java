package com.tutorialspoint.transaction.programmatic;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {

	private final JdbcTemplate jdbcTemplateObject;
	private final PlatformTransactionManager transactionManager;

	public StudentJDBCTemplate(final DataSource dataSource, final PlatformTransactionManager transactionManager) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		this.transactionManager = transactionManager;
	}

	@Override
	public void create(final String name, final Integer age, final Integer marks, final Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);

		try {
			String SQL1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplateObject.update(SQL1, name, age);

			// Get the latest student id to be used in Marks table
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplateObject.queryForObject(SQL2, Integer.class);

			String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
			jdbcTemplateObject.update(SQL3, sid, marks, year);

			System.out.println("Created Name = " + name + ", Age = " + age);
			transactionManager.commit(status);
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
	}

	@Override
	public List<StudentMarks> listStudents() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}
}
