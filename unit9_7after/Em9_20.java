import java.util.*;
public class Em9_20{
	public static void main(String args[]){
		String cost = " TV cost 876 dollar. Computer cost 2398 dollar. Telephone cost 1278 dollar";  //�۸�����ǰ����Ҫ�пո�
		Scanner scanner = new Scanner(cost);                                                         //��������Ҫ������ʽ���ָ�
		double sum = 0;
		while(scanner.hasNext()){                     //scanner���е�����hasNext()����true����֮false
			try{
				double price = scanner.nextDouble(); 
				sum += price;
				System.out.println(price); 
			}
			catch(InputMismatchException exp){
				String t = scanner.next();            //next()�����η���scanner�еĵ���
			}                                         //�����쳣�����next()��ȥ�����ֻ�
		}
		System.out.println("All cost :" + sum + "Ԫ");  
	}                                                  
}

