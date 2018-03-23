package beanCreation.factoryBean;

import java.util.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusFactoryBeanTest {

	public static void main(String[] args) {
		
		String configLocation = "classpath:beanCreation/Factroy-Bean-By-Bean-Creation.xml";
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Date d = context.getBean("date",Date.class);
		System.out.println(d.getClass());
		
		Object o = context.getBean("bus");
		System.out.println(o.getClass());
		
		Bus b = context.getBean("bus",Bus.class);
		System.out.println(b.getName());
		
		context.close();
	}

}
