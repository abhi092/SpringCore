package com.abhi.question1;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//Resource r=new ClassPathResource("spring.xml");  
    	
        //BeanFactory factory=new XmlBeanFactory(r);  
    	
        //Customer obj =(Customer)context.getBean("obj");  
    	  Customer e =(Customer)context.getBean("e"); 
        
      //  Customer e=(Customer)factory.getBean("obj");  
      //  e.displayInfo();
      //    obj.displayInfo();
    	  e.displayInfo();
          
    }  
      
    
}


  
 
