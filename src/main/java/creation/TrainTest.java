package creation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainTest {

	public static void main(String[] args) {
		
		String configLocation = "classpath:BeanCreationByStaticFactory.xml";
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Train t = context.getBean("train",Train.class);
		System.out.println(t);
		
		Train r = context.getBean("train",Train.class);
		System.out.println(r);
		
		context.close();
		
	}
	
}
