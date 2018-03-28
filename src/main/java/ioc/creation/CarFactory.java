package ioc.creation;

public class CarFactory {

	private String name;
	
	public Car create() {
		
		System.out.println("调用CarFactory类中的create方法，给Car的实例赋值");
		
		Car c = new Car();
		c.setName(name);
		return c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
