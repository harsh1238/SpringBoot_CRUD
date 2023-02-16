package com.yash.ems.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.yash.ems.model.JavaTraining;

public class StudentMapper implements RowMapper<JavaTraining> {
   public JavaTraining mapRow(ResultSet rs, int rowNum) throws SQLException {
	   JavaTraining javatraining = new JavaTraining();
	   javatraining.setId(rs.getInt("id"));
	   javatraining.setName(rs.getString("name"));
	   javatraining.setPrice(rs.getInt("age"));
      return javatraining;
   }
}