import java.util.*;
public class Em9_13{
	public static void main(String args[]){                     //���췽����
		String s = "you are welcome\n, nice to meet you";   //StringTokenizer(String)   Ϊs�������������Ĭ�Ϸָ������ո񡢻��С��س���Tab����ֽ �� 
                                                            //StringTokenizer(String,String)          ��s2Ϊ�ָ���
		StringTokenizer fenxi = new StringTokenizer(s);           

//		StringTokenizer fenxi = new StringTokenizer(s," "); //�ᷢ��\nû����Ϊ�ָ�����������Ч����welcome\n,����Ϊһ��

		System.out.println(fenxi.nextToken());              // fenxi.nextToken() �÷�������ȡ�ַ��������Է��ţ������ʣ�����ע����ȡ1�����������о���һ��
		int num = fenxi.countTokens();                      // fenxi.countTokens() �������������Է���
		while(fenxi.hasMoreTokens()){                       // fenxi.hasMoreTokens() �����������Է��žͷ���ture������false
			String str = fenxi.nextToken();
			System.out.print(str + " | ");
		}  
		System.out.println("������" + num);
	}
}

