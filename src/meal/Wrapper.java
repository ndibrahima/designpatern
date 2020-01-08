package meal;

public class Wrapper implements Packing {
	
	String name;

	public Wrapper() {
		this.name = "Wrapper";
	}

	public String toString() {
		return getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return null;
	}

}
