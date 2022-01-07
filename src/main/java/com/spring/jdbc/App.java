package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
   

	public static void main( String[] args )
    {
        System.out.println( "My programs started............." );
        
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");
       
         JdbcTemplate template = context.getBean("jdbcTemplate" , JdbcTemplate.class);
         String query = "insert into student(id,name,city) values(?,?,?)";
         int result = template.update(query ,128,"Waseem " ,"Bulandshar" );
         System.out.println("Query insert succesfully.........." + result);
    
    }
}
