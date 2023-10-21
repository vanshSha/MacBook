package learning;

public class ExceptionHandling {

	public static void main(String[] argu) {

		try {

			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Program");
		}
		System.out.println("Run program");
	}
}
