public class Example5_7 {
	public static void main(String args[]) {
		Lader.�µ� = 100;        //����������������������ʣ��ɶ�����ʣ�Ҳ������ʣ�
		Lader laderOne = new Lader();
		Lader laderTwo = new Lader();
		laderOne.�����ϵ�(28);
		laderTwo.�����ϵ�(66);
//		laderTwo.�����µ�(5);    //������������µ�ȫ��Ϊ5����Ϊ�µ����������ǹ���ģ�Ҳ����˵���ı�һ����������������ôȫ������������ȫ���ı�Ϊͬһ����
		System.out.println(laderOne.��ȡ�ϵ�());
		System.out.println(laderOne.��ȡ�µ�());
		System.out.println(laderTwo.��ȡ�ϵ�());
		System.out.println(laderTwo.��ȡ�µ�());
	}
}