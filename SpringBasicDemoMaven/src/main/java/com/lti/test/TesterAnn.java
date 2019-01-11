package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.model.BeanCreator;
import com.lti.model.NumberGenrator;

public class TesterAnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanCreator.class);
		
		NumberGenrator numGen = ctx.getBean("numberGenerator",NumberGenrator.class);
		
		System.out.println("Random Number generated : "+numGen.getNumber());
				
	}

}
