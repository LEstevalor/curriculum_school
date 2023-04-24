/*用两个for语句输出大写和小写的“字母表”。
*/

public class Test4_5 {
	public static void main(String args[]) {
		int order = 0;
		for(int i = 'a';i <= 'z';i++,order++)  //小写字母表
		{
			if(order % 6 == 0 && order != 0) {
				System.out.println();
			}
			System.out.printf("%c\t",(char)i);   //以防万一，用printf强制输出char字符型的i
		}
		System.out.printf("\n\n");
		order = 0;
		for(int i = 'A';i <= 'Z';i++,order++)  //大写字母表
		{
			if(order % 6 == 0 && order != 0) {
				System.out.println();
			}
			System.out.printf("%c\t",(char)i);
		}
	}
}
