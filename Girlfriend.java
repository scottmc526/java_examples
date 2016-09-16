public class Girlfriend {
	private String girlName;
	//Constructor Method - Allows your to initialize variables as soon as object is created
	public Girlfriend (String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying () {
		System.out.printf("Your first girlfriend was %s", getName());
	}
}
