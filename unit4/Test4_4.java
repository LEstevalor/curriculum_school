/* 解决问题：输入用户用电量，输出电费。
   用户用电量分为3个区间，（记单位为 千瓦（度））电量
   1-90，每千瓦0.6元；
   91-150，每千瓦1.1元；
   大于151，每千瓦1.7元。
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
		System.out.println("The user should pay electricity bills：" + toll);
	}
}