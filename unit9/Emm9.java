public class Emm9{
	public static void main(String args[]){
		String s = "1 haha 2 a 3 ab";
		String regex = "[a-zA-Z]+";       //string.replaceAll(regex,replacement) ����String����regex����ȫ���滻Ϊreplacement
		System.out.println(s.replaceAll(regex,"����"));  //�����1 ���� 2 ���� 3 ����

		s = "dawdadadwdadawda";
		System.out.println(s.replaceAll(regex,"����"));  //���������

		regex = "[\\s\\d\\p{Punct}]+";  //�ո����֡����ַ�����ɵ�������ʽ
		String string = "What are you doing!";
		String []words = string.split(regex);     //string.split(String regex)��Ӧ�ķ��� 
		for(int i = 0; i < words.length; i++){
   			int m = i + 1;
			System.out.println("����" + m + "��" + words[i]);
		} 
	}


