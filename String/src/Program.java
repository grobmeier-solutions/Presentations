
public class Program {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
// # # #		S T R I N G  C O N C A T I N A T I O N		 # # #
		String s3 = s1.concat(" ").concat(s2);	// concat akzeptiert nur String
		System.out.println(s3);
		
		String s4 = s1 + " " + s2;				// akzeptiert alles, sogar null
		System.out.println(s4);

		
// # # #		S T R I N G  C O M P A R I S O N		 # # #		
		// 1. by equals()
		String s5 = "Hello";
		if(s1.equals(s5)) {
			System.out.println(s1 + " is equal to " + s5);
		}
		
		// 2. by == operator
		String s6 = new String("Hello");
		System.out.println(s1 == s5); 			// s1 und s5 haben die gleiche Referenz
		System.out.println(s1 == s6);			// s1 und s6 haben nicht die selbe Referenz
		
		// 3. by compareTo()
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s6));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		
// # # #		S U B S T R I N G 		 # # #
		System.out.println(s4);
		System.out.println(s4.substring(6));	// ab index 6
		System.out.println(s4.substring(0, 5));
		
		
// # # #		U P P E R C A S E / L O W E R C A S E 	 # # #		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1); // Hello
		
// # # #		T R I M 	 # # #	
		String s7 = "      Ein     Satz mit     X       ";
		System.out.println(s7);
		System.out.println(s7.trim());
	}
}
