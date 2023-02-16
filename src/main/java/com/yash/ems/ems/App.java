package com.yash.ems.ems;

import com.yash.ems.serviceimpl.JavTrainingServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JavTrainingServiceImpl test=new JavTrainingServiceImpl();
    	System.out.println(test.getById(1));
    }
}
