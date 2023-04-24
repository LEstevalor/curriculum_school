public class MainClass{
	public static void main(String args[]){
		Student zhang = new Student();
		double area =
		zhang.area(new Rect(2,3), new Circle(5.2), new Circle(12));  //Geometry抽象类声明的对象可以存放子类对象的引用，即成子类对象的上转型对象
		System.out.printf("S总 = %10.3f \n",area);      //↑都是赋予成上转型对象

		area =
        zhang.area(new Triangle(2,2,3), new Circle(5.2), new Circle(12));  //Geometry抽象类声明的对象可以存放子类对象的引用，即成子类对象的上转型对象
		System.out.printf("S总 = %10.3f \n",area);

	}
}