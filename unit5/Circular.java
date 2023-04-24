public class Circular {
	Circle bottom;        //声明 Circle对象bottom   
	double height;        //声明 高 
	Circular(Circle c,double h) {    //带形参的构造方法
		bottom = c;
		height = h;
	}
	double getVolme() {
		return bottom.getArea() * height/3.0;
	}
	double getBottomRadius() {
		return bottom.getRadius();
	}
    public void setBottomRadius(double r) {
		bottom.setRadius(r);
	}
}
