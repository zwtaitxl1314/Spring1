package scpoe;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {

    public static void main(String[] args) {

        String configLocation = "classpath:scope/Scope.xml";

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        //对于scope=”singleton”的Bean来说，在容器初始化时就会创建并初始化这些Bean

        People p1 = context.getBean("people", People.class);

        System.out.println("第一次"+p1);

        People p2 = context.getBean("people", People.class);
        System.out.println("第二次"+p2);

        System.out.println(p2==p1); //因为Bean的Scope=singleton，所以不管获取多少次Bean，Bean的实例永远是同一个
    }
}
