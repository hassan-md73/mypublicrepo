package com.hassan.telco.repeattext;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RepeattextApplication {
	private static final Logger logger = LoggerFactory.getLogger(RepeattextApplication.class);

    public static void main(String[] args) {
    	logger.info("Starting My App: " +   Class.class.toString() );
        SpringApplication.run(RepeattextApplication.class, args);
    }

	@Override
	public String toString()
	{
		return "RepeattextApplication [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
    

}
