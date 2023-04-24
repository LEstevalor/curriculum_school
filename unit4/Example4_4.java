public class Example4_4 {
	public static void main(String args[]) {
		double sum = 0,item = 1;
		int i = 1,n = 20;
		while(i <= n) {
			sum += item;
			i += 1;
			item *= (1.0/i); 
		}
		System.out.println("sum = "+sum);
	}
}