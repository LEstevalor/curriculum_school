import java.util.Arrays;
public class Example4_7 {
	public static void main(String args[]) {
		char a[] = {'a','b','c','d'};
		for(int n = 0;n < a.length;n++) { //传统方式
			System.out.print(a[n] + " ");    
		}
		System.out.println();
		for(char ch:a) {                  //非传统方式（注意，循环变量一定是在内部声明的）
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));  //此处结果为[a,b,c,d]

		System.out.println(a);    //此处结果 abcd
	}
}
