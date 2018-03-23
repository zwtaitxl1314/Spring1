package beanCreation.instanceFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:beanCreation/BeanCreationByInstanceBean.xml";
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Car s = context.getBean("car", Car.class);
		
		System.out.println(s.getName()+"123");
		
		context.close();
	}
}
