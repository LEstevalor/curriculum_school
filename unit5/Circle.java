public class Circle {
	double radius;     //半径
	double area;       //面积

	Circle() {         //不带形参的构造方法
	}

	Circle(double r) { //带形参的构造方法
		radius = r;
	}

	void setRadius(double r) {  //方法——设置半径
		if(r > 0){
			radius = r;
		} 
	}

	double getRadius() {        //方法——得到半径值
		return radius;
	}

	double getArea() {          //方法——得到面积值
		area = 3.14 * radius * radius;
		return area;
	}
}