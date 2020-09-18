
public class Main {

	public static void main(String[] args) {
		String myStr = "Hello";
		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false
		System.out.println(myStr.contains("eo"));    // false
	}

}
