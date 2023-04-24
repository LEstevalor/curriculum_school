class Point {
	int x;
	int y;
	Point(int a,int b){ //构造方法
		x = a;
		y = b;
	}
}

public class Example5_2 {
	public static void main(String args[]) {
//		Point p1;
		Point p2;
//		p1 = new Point();  // 注：若定义 1或多 构造方法，java将不会提供默认的构造方法，此时的Point()非法
		p2 = new Point(1,2);

	}
} 

