/* ������⣺�����û��õ����������ѡ�
   �û��õ�����Ϊ3�����䣬���ǵ�λΪ ǧ�ߣ��ȣ�������
   1-90��ÿǧ��0.6Ԫ��
   91-150��ÿǧ��1.1Ԫ��
   ����151��ÿǧ��1.7Ԫ��
*/

import java.util.Scanner;
public class Test4_4 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter user power consumption:");
		int userConsumption = reader.nextInt();
		double toll = 0.0;
		if(userConsumption <= 90)
			toll = userConsumption * 0.6;
		else if(userConsumption <= 150)
			toll = (userConsumption-90) * 1.1 + 90 * 0.6;
		else
			toll = (userConsumption-150) * 1.7 + 90 * 0.6 + 60 * 1.1;
		System.out.println("The user should pay electricity bills��" + toll);
	}
}