
public class ConversaoTipos {

	public static void main(String[] args) {
		char a = 'a';
		int i = (int)a;
		int x = (int)10L;
		
		System.out.println("a " + a);
		System.out.println("i " + i);
		System.out.println("x " + x);
		
		
		String piStr = "3.14159";
		Float pi = Float.valueOf(piStr);
		float piF = Float.parseFloat(piStr);
		
		System.out.println(piStr);
		System.out.println(pi);
		System.out.println(piF);
	}

}
