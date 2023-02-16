package com.yash.ems.service;

import java.util.List;

import com.yash.ems.model.JavaTraining;

public interface JavaTrainingService 
{
	List<JavaTraining> product();
	public JavaTraining getById(int id);
	public JavaTraining save(JavaTraining data);
	public JavaTraining delete(int id);
}
