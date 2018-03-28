package ioc.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTestConstructor {

	public static void main(String[] args) {

		String configLocation = "classpath:ioc.autowiring/ioc.autowiring-Constructor.xml";

		AbstractApplicationContext context = new ClassPathXmlApplicationContext( configLocation );

		Person p = context.getBean("txl",Person.class);

		System.out.println( p.getName());
		System.out.println(p.getGirl().getName());
	}

}
