public class Example5_9 {
	public static void main(String args[]) {     //��̬��������
		Circle circle = new Circle();            //���������Ϊ���������Ͳ�ͬ
		circle.setRadius(196.87);                //һ������ΪTixing����һ������ΪCircle
		Tixing lader = new Tixing(3,21,9);
		People zhang = new People();
		System.out.println("zhang����Բ�����");
		double result = zhang.computerArea(circle);     
		System.out.println(result);
		System.out.println("zhang�������������");
		result = zhang.computerArea(lader);
		System.out.println(result);
	}
}