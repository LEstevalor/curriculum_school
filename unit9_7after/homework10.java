import java.util.Scanner;
class homework10{
	public static void main(String args[]){	
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		System.out.println(Math.abs(num1));
		System.out.println(Math.max(num1,num2));
		System.out.println(Math.min(num1,num2));
		System.out.println(Math.random());
		System.out.println(Math.pow(num1,2));
		System.out.println(Math.sqrt(Math.abs(num1)));
		System.out.println(Math.log(Math.abs(num1)));
		System.out.println(Math.sin(num1));
		System.out.println(Math.asin(num1));
	}
}