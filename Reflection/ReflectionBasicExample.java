package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionBasicExample {

	public static void main(String args[]) throws ClassNotFoundException {
		// List Beispiel:
		Class listClass = Class.forName("java.util.List");

		// Alle Methoden von List ausgeben
		Method m[] = listClass.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}

		System.out.println("\n");

		System.out.println("Parameters add(): " + Arrays.toString(m[0].getParameters()));
		System.out.println("Interface: " + listClass.isInterface());

		// ArrayList Beispiel:
		Class arrayListClass = Class.forName("java.util.ArrayList");

		// Alle Constructors von ArrayList ausgeben
		Constructor[] constructors = arrayListClass.getConstructors();
		System.out.println("Constructors: " + Arrays.toString(constructors));

		int modifiers = constructors[0].getModifiers();
		System.out.println("Modifier vom 1. Constructor: " + Modifier.toString(modifiers));

		// Alle Fields von ArrayList ausgeben
		Field[] fields = arrayListClass.getDeclaredFields();
		System.out.println("Fields von ArrayList:");
		for (Field f : fields) {
			System.out.println(f);
		}

		// Fields veraendern
		List<Integer> test = new ArrayList<>();
		System.out.println(test.size());

		Field arrayListFieldSize = null;
		try {
			arrayListFieldSize = arrayListClass.getDeclaredField("size");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		arrayListFieldSize.setAccessible(true);
		try {
			arrayListFieldSize.setInt(test, 5);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println(test.size());
		System.out.println(test.get(2));
	}

}
