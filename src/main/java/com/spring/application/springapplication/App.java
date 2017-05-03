package com.spring.application.springapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/application/springapplication/beans/bean.xml");
		Person person1 = (Person) context.getBean("person");
		person1.setTaxId(696);
		System.out.println(person1);
		
		/*JobExperience job1 = (JobExperience) context.getBean("jobexperience");
		System.out.println(job1);*/
		
		((ClassPathXmlApplicationContext)context).close();
		
		/*Address address = (Address) context.getBean("address");
		System.out.println(address);*/
		/*
		 * Person p = new Person("Guruprasad"); p.displayPerson();
		 * System.out.println( "Hello World!" );
		 */
	}
}
