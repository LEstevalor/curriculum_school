/*������for��������д��Сд�ġ���ĸ����
*/

public class Test4_5 {
	public static void main(String args[]) {
		int order = 0;
		for(int i = 'a';i <= 'z';i++,order++)  //Сд��ĸ��
		{
			if(order % 6 == 0 && order != 0) {
				System.out.println();
			}
			System.out.printf("%c\t",(char)i);   //�Է���һ����printfǿ�����char�ַ��͵�i
		}
		System.out.printf("\n\n");
		order = 0;
		for(int i = 'A';i <= 'Z';i++,order++)  //��д��ĸ��
		{
			if(order % 6 == 0 && order != 0) {
				System.out.println();
			}
			System.out.printf("%c\t",(char)i);
		}
	}
}
