class Sum {
	int x,y,z;                 //�෽�����ɲٿ�ʵ�����������ഴ������ǰ��ʵ����Ա������δ�����ڴ�
	static int getContinueSum(int start,int end) {   //�෽������̬��������������ǰ����static�ؼ��ֵģ�
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

public class Example5_8 {
	public static void main(String args[]) {     //�Ա���ͨ�����µķ�����ʵ����������ʲô��ͬ��
		int result = Sum.getContinueSum(0,100);  //�ᷢ�֣�������ֱ��ͨ���������÷����ģ���û�д�������
		System.out.println(result);  
	}
}
