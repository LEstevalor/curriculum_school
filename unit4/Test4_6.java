/* 一个自然数恰好等于它的因子之和，这个数就称为“完数”(除自身以外)（1不是，因为1的本身就是1.）
   求1000以内所有的完数。
*/

public class Test4_6 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 2;i <= 1000;i++){
			for(int j = 1;j < i;j++){
				if(i % j == 0){
					sum += j;
				}
			}
			if(i == sum){
				System.out.printf("%d\t",i);
			}
			sum = 0;
		}
	}
}