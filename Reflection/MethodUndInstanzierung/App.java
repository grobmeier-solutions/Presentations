import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		Class<?> classObject = Class.forName("Fruit");
		System.out.println("Name des Class Objects: " + classObject.getSimpleName());

		Constructor<?> constructor = classObject.getConstructor();
		Method setNameMethod = classObject.getDeclaredMethod("setName", String.class);
		Method setColourMethod = classObject.getDeclaredMethod("setColour", String.class);

		Object fruit = constructor.newInstance();
		setNameMethod.invoke(fruit, "Kiwi");
		setColourMethod.invoke(fruit, "Green");

		System.out.println("Neue Instanz: " + fruit);

		// https://www.baeldung.com/java-reflection
	}

}
