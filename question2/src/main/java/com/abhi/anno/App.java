package com.abhi.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.anno.AppConfig;
import com.abhi.anno.Question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Question question= context.getBean("getQuestion",Question.class);
		
		System.out.println(question);

	}

}