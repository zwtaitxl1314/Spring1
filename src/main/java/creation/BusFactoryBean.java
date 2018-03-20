package creation;

import org.springframework.beans.factory.FactoryBean;

public class BusFactoryBean implements FactoryBean<Bus>{

	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Bus getObject() throws Exception {
		Bus b = new Bus();
		b.setName(name);
		return b;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
	
	
	
	

}
