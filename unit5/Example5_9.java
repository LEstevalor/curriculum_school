public class Example5_9 {
	public static void main(String args[]) {     //多态——重载
		Circle circle = new Circle();            //这里的例子为：参数类型不同
		circle.setRadius(196.87);                //一个类型为Tixing，另一个类型为Circle
		Tixing lader = new Tixing(3,21,9);
		People zhang = new People();
		System.out.println("zhang计算圆面积：");
		double result = zhang.computerArea(circle);     
		System.out.println(result);
		System.out.println("zhang计算梯形面积：");
		result = zhang.computerArea(lader);
		System.out.println(result);
	}
}