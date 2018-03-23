package beanCreation.staticFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SunTest {

	public static void main(String[] args) {

		String configLocation = "classpath:beanCreation/staticfactory.xml";
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Sun s = context.getBean("sun", Sun.class);  //无论调用多少次都只会得到一个对象，因为对象是已经创建好的了
		System.out.println(s);  
		
		Sun u = context.getBean("sun", Sun.class);
		System.out.println(u);
		
		Sun n = context.getBean("sun", Sun.class);
		System.out.println(n);
		
		context.close();
	}

}
