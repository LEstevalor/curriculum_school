import java.util.*;
public class E{
	public static void main(String args[]){
		String s1 = "ƻ��5.67Բ���㽶��12Բ��â����19.8Բ";
		String s2 = "����6.7Բ�����Σ�0.8Բ��ե�ˣ�9.8Բ";
		// StringTokenizer fenxi1 = new StringTokenizer(s1,":��");    //�޷����쳣����ķ�ʽ��string1�ָ���
		// double sum = 0;                      
		// while(fenxi1.hasMoreTokens()){
		// 	try{
		// 		sum += parseDouble(fenxi1.nextToken()); 
		// 	}
		// 	catch(Exception exp){
		// 		String t = fenxi1.next();  //StringTokenizer����next()����
		// 	}                                  
		// }
		ComputePice jisuan = new ComputePice();
		String regex = "[^0123456789.]+";       //ƥ�����з������ַ���
		String s1_number = s1.replaceAll(regex,"*");
		double priceSum = jisuan.compute(s1_number,"*");
		System.out.printf("\"%s\"�۸��ܺ�:\n%fԲ\n",s1,priceSum);
		String s2_number = s2.replaceAll(regex,"#");
	 	priceSum = jisuan.compute(s2_number,"#");
		System.out.printf("\"%s\"�۸��ܺ�:\n%fԲ\n",s2,priceSum);

		regex = "[0123456789.]+Բ";
		String str = s1.replaceAll(regex," ");
		str = str.replaceAll("��","");
		str = str.replaceAll("��","");   //����replaceAll("����","")�ﲻ��Ч��
		System.out.println(str);      //ƻ�� �㽶 â��

	}
}
class ComputePice{
	double compute(String s,String fenge){
		StringTokenizer fenxiOne = new StringTokenizer(s,fenge);
		double sum = 0;
		double digitItem = 0;
		while(fenxiOne.hasMoreTokens()){
			String str = fenxiOne.nextToken();
			digitItem = Double.parseDouble(str);
			sum += digitItem;
		}
		return sum;
	}
}