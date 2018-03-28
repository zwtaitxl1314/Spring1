package ioc.beanCreation.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentTest {
	
	public static void main(String[] args) {
		
		
		System.out.println(System.getProperty("java.class.path"));
		
		//指定 ConfigLocation Metadata(配置元数据)
		String configLocation = "classpath:ioc.beanCreation/construct.xml";
		
		//创建Spring IoC容器
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

		//Ready for use(此时可以从IoC容器)
		//getBean(Beans.xml中bean的id的值，确定get方法返回值的类型)
		Student s =context.getBean("student",Student.class);
		
		
		//从Spring IoC容器中获取到Besn实例中获取属性的值
		System.out.println(s.getId()+","+s.getName());	
		
		System.out.println(context);
		
		//关闭Spring IoC容器
		context.close();
	}
}
