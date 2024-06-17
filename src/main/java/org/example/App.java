package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User obj = (User) context.getBean("user");
        obj.code();
//        Computer com=(Computer)context.getBean("com");
//        com.coding();
    }
}
