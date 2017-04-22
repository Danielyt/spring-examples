/**
 * 
 */
package com.tutorialspoint.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Drusev
 *
 */
public class StudentJDBCTemplate implements StudentDAO {
	private final JdbcTemplate jdbcTemplateObject;

	public StudentJDBCTemplate(final DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(final String name, final Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
	}

	@Override
	public Student getStudent(final Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public void delete(final Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
	}

	@Override
	public void update(final Integer id, final Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
	}
}
