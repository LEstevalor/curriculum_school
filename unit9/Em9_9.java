import java.util.Scanner;

public class Em9_9{
	public static void main(String args[]){
		String regex = "[a-zA-Z]+";        //[a-zA-Z]������ʽ(����+�����ﲻ��ȱ)
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();   //�����ַ�
		if(str.matches(regex)){            //string.matches(regex) �ַ���������������ʽƥ��
			System.out.println(str + " �ַ�ȫ��Ӣ��");
		}
	}
}

