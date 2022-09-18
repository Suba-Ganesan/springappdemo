package com.samples.SpringJDBC.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.samples.SpringJDBC.dto.Employee;
import com.samples.SpringJDBC.dao.EmployeeDAO;
import com.samples.SpringJDBC.dao.rowmapper.EmployeeRowMapper;

@Component("employeedaoimpl")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values (?, ?,?,?)";
		int result = jdbcTemplate.update(sql, emp.getEid(), emp.getName(), emp.getDesignation(),emp.getSalary());
		return result;
	}
		@Override
		public int update(Employee emp) {
			String sql = "update employee set name=?, designation=? where eid=?";
			int result = jdbcTemplate.update(sql,emp.getName(), emp.getDesignation(),emp.getSalary(),emp.getEid());
			System.out.println("Employee updated");
			return result;
		}

		@Override
		public int delete(int id) {
			String sql = "delete from employee where eid=?";
			int result = jdbcTemplate.update(sql, id);
			System.out.println("Employee deleted");
			return result;
	}
		@Override
		public Employee read(int id) {
			String sql = "select * from employee where eid = ?";
			EmployeeRowMapper mapper = new EmployeeRowMapper();
			Employee employee = jdbcTemplate.queryForObject(sql, mapper, id);
			return employee;
		}
		@Override
		public List<Employee> read() {
			String sql = "select * from employee";
			EmployeeRowMapper mapper = new EmployeeRowMapper();
			List<Employee> employees = jdbcTemplate.query(sql, mapper);
			return employees;
		}
}