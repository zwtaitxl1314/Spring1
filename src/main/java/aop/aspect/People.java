package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class People {

    public  void qianmian(JoinPoint jp){
        Signature s = jp.getSignature();
        String method = s.getName();
        System.out.println("我在"+method+"方法执行之前先执行了！~~");

    }

    public  void houmian (JoinPoint jp){
        Signature s = jp.getSignature();
        String method = s.getName();
        System.out.println("我在"+method+"方法执行之后执行了！~~");

    }
}
