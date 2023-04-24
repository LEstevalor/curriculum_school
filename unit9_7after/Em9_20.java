import java.util.*;
public class Em9_20{
	public static void main(String args[]){
		String cost = " TV cost 876 dollar. Computer cost 2398 dollar. Telephone cost 1278 dollar";  //价格数字前后需要有空格
		Scanner scanner = new Scanner(cost);                                                         //↑否则需要正则表达式做分隔
		double sum = 0;
		while(scanner.hasNext()){                     //scanner内有单词则hasNext()返回true，否之false
			try{
				double price = scanner.nextDouble(); 
				sum += price;
				System.out.println(price); 
			}
			catch(InputMismatchException exp){
				String t = scanner.next();            //next()，依次返回scanner中的单词
			}                                         //常用异常处理接next()除去非数字化
		}
		System.out.println("All cost :" + sum + "元");  
	}                                                  
}

