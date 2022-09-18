package com.samples.SpringJDBC.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.samples.SpringJDBC.dto.Employee;


public class EmployeeRowMapper implements RowMapper<Employee>{

	// how to build object from resultset
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEid(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setDesignation(rs.getString(3));
		emp.setSalary(rs.getInt(4));
		return emp;
	}

}