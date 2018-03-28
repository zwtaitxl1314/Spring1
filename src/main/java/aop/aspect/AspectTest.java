package aop.aspect;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {

    public static void main(String[] args) {

       String configLocation = "classpath:aop/aspect.xml";

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        Sun s = context.getBean("air",Sun.class);

        s.look();

    }
}
