package java_problem;

import java.util.Arrays;

public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x = 10;
			int y = x / 0;
			System.out.println(y);
		} catch (ArithmeticException e) {

			int x = 10;
			int y = x / 3;
			System.out.println(y);

		}

		catch (Exception e) {

			int x = 10;
			int z = x / 3;
			System.out.println(z);

		}

		System.out.println("abhilash2");

	}

}
