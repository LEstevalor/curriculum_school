/* һ����Ȼ��ǡ�õ�����������֮�ͣ�������ͳ�Ϊ��������(����������)��1���ǣ���Ϊ1�ı������1.��
   ��1000�������е�������
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