import java.text.*;  //DecimalFormat����java.text����x
public class Try1{   //��ʽ������λ��С��λ
	public static void main(String args[]){
		DecimalFormat format = new DecimalFormat("000.00");  //DecimalFormat(��������λ.����С��λ)
		String result1 = format.format(9966.666);            //String format(double number)    DecimalFormat������÷���
		System.out.println(result1);                //9966.67(�������룬ȴ���㣩
		System.out.println(format.format(66.6));    //066.60 (��������λ��ȴ���㣩
		new Try1_2().try2();    
		Try1_3.try3();          
		new Try1_4();           
	}
}
class Try1_2{        //����λ�ķ���
	void try2(){
		DecimalFormat format = new DecimalFormat("#,###,###0.00"); //("#,#####,##00.00")һ����ֻ�ɲ�����С����������λ#0����������		                                                         
		String result = format.format(123456789.99); //1,2345,6789.99    //###0��λ
		System.out.println(result);                                //ע"##0.00"������ʹ23.33���023.33
	}
}
class Try1_3{        //�ٷ�����ǧ����
	static void try3(){
		DecimalFormat format = new DecimalFormat("#00.00%");  //����ٷ�������ʽ��������ӡ�%�� 
		String result = format.format(12.345678);     
		System.out.println(result);      //1234.57%
                                                              //���ǧ��������ʽ��������ӡ�\u2030��     
		System.out.println(new DecimalFormat("����#00.00\u2030���").format(12.345678));     //����12345.68���� 
	}                                                         //����# . , 0�������ӷ���
}
class Try1_4{         //��ѧ������
	Try1_4(){
		DecimalFormat format = new DecimalFormat("0.0E0");     //��ѧ����������ʽ��������ӡ�E0��
		String result = format.format(123.45);   
		System.out.println(result);	     //1.2E2
		try{                                      // try catch����                                                 ����������������ʽ����Ϊ����
			Number num = format.parse("1.2E2");   //���������в���������Ա��׳�    //����õ��� num=120 Ϊ Number ����
			double b = num.doubleValue();         //Number ���� = ��ʽ������.parse(Ҫת�����ַ���);
			System.out.println(num);              //double ��� = ����.doubleValue();  //�����Number���ͱ�ΪDouble����
		}
		catch(Exception exp){}		
	}
}

