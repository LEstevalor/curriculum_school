/* 求1! + 2! + …… + n! <= 9876 的最大整数n
*/

public class Test4_7 {
	public static void main(String args[]) {
		int sum = 0,temp = 1,n = 0;  
		for(int i = 1;sum <= 9876;i++)
		{
			temp *= i;
			sum += temp;
			n = i;
		}
		System.out.printf("n = %d\n",n - 1);
	}
}