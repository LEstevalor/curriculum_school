import java.util.*;
public class Em9_21{
	public static void main(String args[]){
		String cost = "话费清单：市话费76.89元，长途话费167.38元，短信费12.68元";
		Scanner scanner = new Scanner(cost);
		scanner.useDelimiter("[^0123456789.]+");      //scanner.useDelimiter(正则表达式) —— 分隔标记，可以比较前一例子Em9_20
		double sum = 0;
		while(scanner.hasNext()){
			try{
				double price = scanner.nextDouble();
				sum += price;
				System.out.println(price);
			}
			catch(InputMismatchException exp){
				String t = scanner.next();
			}
		}
		System.out.println("All cost:" + sum + "元");
	}
}


