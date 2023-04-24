public class Example5_4 {
	public static void main(String args[]) {
		Circle circle = new Circle();       //创建Circle对象
		double w = 121.709;
		circle.setRadius(w);                //调用setRadius方法设置半径
		System.out.println("半径：" + circle.getRadius());  //同理调用
		System.out.println("面积：" + circle.getArea());

		w = 100;          
		System.out.println("w = " + w);                     //并没有再次传递，所以即使改变原变量值
		System.out.println("半径：" + circle.getRadius());  //传递的形参值是不变的
	}
}