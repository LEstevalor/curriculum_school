public class Example5_5 {
	public static void main(String args[]) {
		Circle circle = new Circle(10);                 //����Circle����circle������radius=10��
		System.out.println("main������circle�����ã�" + circle);
		System.out.println("main������circle�İ뾶��" + circle.getRadius());
		Circular circular = new Circular(circle,20);    //����Circular����circular������bottom = circle,height = 20��
		System.out.println("circularԲ׶��bottom���ã�" + circular.bottom);
		System.out.println("Բ׶��bottom�뾶��" + circular.getBottomRadius());
		System.out.println("Բ׶�������" + circular.getVolme());
		double r = 8888;
		System.out.println("Բ׶���ĵ�Բbottom�İ뾶��" + r);
		circular.setBottomRadius(r);
		System.out.println("Բ׶��bottom�뾶��" + circular.getBottomRadius());
		System.out.println("Բ׶�������" + circular.getVolme());
		System.out.println("main������circle�İ뾶��" + circle.getRadius());
		System.out.println("main������circle�����ý������ı�");
		circle = new Circle(1000);
		System.out.println("����main������circle�����ã�" + circle);
		System.out.println("main������circle�İ뾶��" + circle.getRadius());
		System.out.println("����Ӱ��circularԲ׶��bottom������");
		System.out.println("circularԲ׶��bottom�����ã�" + circular.bottom);
		System.out.println("Բ׶��bottom�뾶��" + circular.getBottomRadius());
	}
}
