public class Emmmm9{                        //StringBuffer��append����
	public static void main(String args[]){
		StringBuffer a = new StringBuffer("���������");
		System.out.println(a.append("������"));    //��������ʹ�����       1�� append(String s) ���ص�ǰ���������    
		System.out.println(a.append(123));        //��������ʹ�����123    2�� append(int n) int���ݱ�Ϊ�ַ�����׷�ӣ���ͬ����Ĳ���
		String b = "456";
		System.out.println(a.append(b));          //��������ʹ�����123456 3�� append(Object o) ������ַ���׷�ӣ����ص�ǰ���������

		short c = 1;
		System.out.println(a.append(c));          //��������ʹ�����1234561
		//��2�ڿ����ƣ�long,boolean,float,double,char,short.byteҲ���Ժ�2������ʹ�á�
	}
}


