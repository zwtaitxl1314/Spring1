package creation;

//懒汉式单例类.在第一次调用的时候实例化自己 
//Train通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，Train的唯一实例只能通过create()方法访问。
public class Train {

	private Train() {
	}
	
	public static Train create() {
		
		System.out.println("静态工厂创建Bean");
		Train t = new Train();
		return t;
	}
	

}
