package creation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:BeanCreationByInstanceBean.xml";
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Car s = context.getBean("car", Car.class);
		
		System.out.println(s.getName());
		
		context.close();
	}
	

	
}
