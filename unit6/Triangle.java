public class Triangle extends Geometry {
	double a,b,c,p;
	Triangle(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getArea(){
		p = (a + b + c)/2; 
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
		// ������ Math.pow(m,n) m��n�η�
	}
}