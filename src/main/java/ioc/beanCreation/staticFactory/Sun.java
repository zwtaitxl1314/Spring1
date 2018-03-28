package ioc.beanCreation.staticFactory;

//饿汉式单例类，在类初始化时，已经自行实例化   
public class Sun {
	private Sun() {
	}
	
	//静态工厂方法
	public static Sun suncreat() {
		Sun SUN = new Sun();
		System.out.println("静态工厂方法创建Bean实例!");
		return SUN;
	}
	
	
}