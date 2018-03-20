package creation;

//饿汉式单例类，在类初始化时，已经自行实例化   
public class Sun {
	
	private static final Sun SUN = new Sun() ;
	
	private Sun() {
		
	}
	
	//静态工厂方法
	public static Sun suncreat() {
		
		System.out.println("实例工厂方法创建Bean实例!");
		return SUN;
	}
	
	
}