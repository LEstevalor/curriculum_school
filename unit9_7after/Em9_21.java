import java.util.*;
public class Em9_21{
	public static void main(String args[]){
		String cost = "�����嵥���л���76.89Ԫ����;����167.38Ԫ�����ŷ�12.68Ԫ";
		Scanner scanner = new Scanner(cost);
		scanner.useDelimiter("[^0123456789.]+");      //scanner.useDelimiter(������ʽ) ���� �ָ���ǣ����ԱȽ�ǰһ����Em9_20
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
		System.out.println("All cost:" + sum + "Ԫ");
	}
}


