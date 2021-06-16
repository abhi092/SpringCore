package com.abhi.question9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
  
// HelloWorld class
@Component
public class helloworld {
  
    // Annotate this method to execute it
    // automatically as the bean is
    // instantiated
    @PostConstruct
    public void init() throws Exception
    {
        System.out.println(
            "Bean HelloWorld is called & "
            + "instantiated and is the "
            + "init() method");
    }
  
    // Annotate this method to execute it
    // when Spring container is closed
    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println(
            "Conatiner is called "
            + "and is destroy() method");
    }
}
