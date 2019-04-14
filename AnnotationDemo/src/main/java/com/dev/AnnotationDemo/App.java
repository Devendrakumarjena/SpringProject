package com.dev.AnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new  ClassPathXmlApplicationContext("SpringBean.xml");
       
       vehical obj =(vehical) context.getBean("bike");
       
       obj.Drive();
    }
}
