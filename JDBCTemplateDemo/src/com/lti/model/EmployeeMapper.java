package com.lti.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper{

	@Override
	public  Employee mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub
	 Employee emp=new Employee();
	 emp.setId(rs.getInt("id"));
	 emp.setName(rs.getString("name"));
	 emp.setAge(rs.getInt("age"));
	 emp.setSalary(rs.getFloat("salary"));
	 
	 return emp;
	}

}
