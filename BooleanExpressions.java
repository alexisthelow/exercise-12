import java.util.Scanner;

public class BooleanExpressions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;
		
		System.out.print("Give me two numbers. First: ");
		x = scanner.nextDouble();
		System.out.print("Second: ");
		y = scanner.nextDouble();
		
		a = (x < y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);
		
		System.out.println(x + " is LESS THAN " + y + ": " + a);
		System.out.println(x + " is LESS THAN / EQUAL TO " + y + ": " + b);
		System.out.println(x + " is EQUAL TO " + y + ": " + c);
		System.out.println(x + " is NOT EQUAL TO " + y + ": " + d);
		System.out.println(x + " is GREATER THAN " + y + ": " + e);
		System.out.println(x + " is GREATER THAN / EQUAL TO " + y + ": " + f);
		System.out.println();
		
		System.out.println(!(x < y) + " " + (x >= y));
		System.out.println(!(x <= y) + " " + (x > y));
		System.out.println(!(x == y) + " " + (x != y));
		System.out.println(!(x != y) + " " + (x == y));
		System.out.println(!(x > y) + " " + (x <= y));
		System.out.println(!(x >= y) + " " + (x < y));
		
		/*
		< is less than
		> is greater than
		== is equal to
		!= is not equal to
		<= is less than or equal to
		>= is greater than or equal to
		*/
	}
}