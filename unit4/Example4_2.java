import java.util.Scanner;

public class Example4_2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("��������루����������");
		int number = reader.nextInt();
		JudgeAward judge = new JudgeAward();
		judge.giveMess(number);
	}
}