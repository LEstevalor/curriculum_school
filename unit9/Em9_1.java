public class Em9_1{
	public static void main(String args[]){
		String s1,s2;
		s1 = new String("�������");     
		s2 = new String("�������");     
		System.out.println(s1.equals(s2));   //ture
		System.out.println(s1 == s2);        //false
		String s3,s4;
		s3 = "�����޵�";
		s4 = "�����޵�";
		System.out.println(s3.equals(s4));   //ture
		System.out.println(s3 == s4);        //ture

		System.out.println();
		String v = new String("���Ͱ�����");
		System.out.println(v.endsWith("����")); //false
		System.out.println(v.contains("����")); //true

		String a = "ad", c = "dd";
		System.out.println(a.compareTo(c));  //-3
		System.out.println(a.substring(0,1));//a
		System.out.println(c.indexOf("d",0));//0

		a = "  ad ";
		System.out.println(a.trim());     //�����ad
		

	}   //�ַ��������Ƕ�����˿��԰��ַ������������ø�ֵ��һ���ַ�������
}

