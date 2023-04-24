public class ComputerSum {
	void giveSum(int number , int length) {
		if (number <= 9 && number >= 1) {
			long sum = 0;
			long a = number; 
			long item = a; 
			long n = length;
			long i = 1;
			for(i = 1;i <= n;i++) {
				sum = sum + item;
				item = item + 10 + a;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("请输入正确的数字");
		}
	}
}