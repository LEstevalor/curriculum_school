public class Example5_4 {
	public static void main(String args[]) {
		Circle circle = new Circle();       //����Circle����
		double w = 121.709;
		circle.setRadius(w);                //����setRadius�������ð뾶
		System.out.println("�뾶��" + circle.getRadius());  //ͬ�����
		System.out.println("�����" + circle.getArea());

		w = 100;          
		System.out.println("w = " + w);                     //��û���ٴδ��ݣ����Լ�ʹ�ı�ԭ����ֵ
		System.out.println("�뾶��" + circle.getRadius());  //���ݵ��β�ֵ�ǲ����
	}
}