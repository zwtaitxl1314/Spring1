package ioc.scpoe;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {

    public static void main(String[] args) {

        String configLocation = "classpath:ioc.scope/Scope.xml";

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Human p1 = context.getBean("people2", Human.class);

        System.out.println("第一次"+p1);

        Human p2 = context.getBean("people2", Human.class);
        System.out.println("第二次"+p2);

        //在控制台的输出中，会出现两次 "我执行了"，是因为 singletonScope.xml中第一个Bean的默认scope默认为singleton,没当容器创建一次，就会

    }

}
