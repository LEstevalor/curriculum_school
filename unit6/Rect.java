public class Rect extends Geometry {   //继承，Rect类为Geometry类的子类
	double a,b;
	Rect(double a, double b){   //含参构造方法
		this.a = a;
		this.b = b;             //this
	}
	public double getArea(){
		return a * b;           //矩形的面积（继承的抽象类必须重写）
	}
}