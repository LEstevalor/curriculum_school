public class Circle extends Geometry {
	double r;
	Circle(double r){
		this.r = r;
	}
	public double getArea(){
		return 2 * 3.14 * r * r;  //Բ���
	}
}