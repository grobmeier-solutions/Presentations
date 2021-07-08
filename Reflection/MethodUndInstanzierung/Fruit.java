
public class Fruit {

	private String name;
	private String colour;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Fruit [" + (name != null ? "name=" + name + ", " : "") + (colour != null ? "colour=" + colour : "")
				+ "]";
	}

}
