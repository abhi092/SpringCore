package com.abhi.question8.annot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	context.registerShutdownHook();
		Customer obj=(Customer)context.getBean("customer");
		obj.customerDetails();
        
    }
}
