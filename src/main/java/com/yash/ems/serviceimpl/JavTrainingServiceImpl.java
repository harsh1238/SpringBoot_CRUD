package com.yash.ems.serviceimpl;
/**
 * harsh
 */
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.ems.model.JavaTraining;
import com.yash.ems.service.JavaTrainingService;

public class JavTrainingServiceImpl implements JavaTrainingService{

	
	 private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		   }
	@Override
	public List<JavaTraining> product() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaTraining getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaTraining save(JavaTraining data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaTraining delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
