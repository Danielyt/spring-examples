/**
 * 
 */
package com.tutorialspoint.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author Drusev
 *
 */
public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
