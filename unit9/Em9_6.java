public class Em9_6{
	public static void main(String args[]){
		char []a,b,c;
		String s ="2009��10��1���ǹ���60����";
		a = new char[2];                                              //ע��������뱣֤string2�㹻����
		s.getChars(11,13,a,0);      //string1.getChars(m,n,string2,x)  �ַ���string1[m]~[n]λ���ϵ��ַ����루string2��[x]����ʼ��������[0]�� 
		System.out.println(a);
		c = "ʮһ����".toCharArray();    // []c = "ʮһ����" ���������� toCharArray()����
        //		[]c = "ʮһ����";      //���󣬷Ƿ��ı��ʽ
		System.out.println(c);
		for(char ch:c){
			System.out.print(ch);
		} 
	}
}