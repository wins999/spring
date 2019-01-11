package com.lti.model;

import java.sql.Types;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class Data {
	
	@Autowired
	private DataSource dataSource;
	private SimpleJdbcCall simpleJdbcCall;
	
	@PostConstruct
    public void init() {
    	JdbcTemplate template = new JdbcTemplate(dataSource);
    	simpleJdbcCall = new SimpleJdbcCall(template)
    			.withProcedureName("GET_SUM")
    			.withSchemaName("hr")
    			.declareParameters(
    					new SqlParameter("first_num", Types.INTEGER),
    					new SqlParameter("second_num",Types.INTEGER),
    					new SqlOutParameter("result ",Types.INTEGER)
    			);    			
    }
    
    public void findSum() {
    	MapSqlParameterSource sqlParam = new MapSqlParameterSource();
    	sqlParam.addValue("first_num", 5);
    	sqlParam.addValue("second_num", 10);
    	
    	Map<String, Object> reMap = simpleJdbcCall.execute(sqlParam);
    	System.out.println(reMap);
    }

}
