package a02_변수;

public class Cat {
	public static void main(String[] args) {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		System.out.println();
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		final int HOURLY_WAGE = 9160;
		int monthlyPay = 0;
		double a = 9160 * 8 * 3;
		double b = 9160 * 8 * 5;
		double c = (9160 + (9160 * 0.05)) * 8 * 3;
		double d = (9160 + (9160 * 0.05)) * 8 * 5;
		monthlyPay = ((int)((a + b + c + d)/10))*10;
		System.out.println(monthlyPay);
	}
}
