public class Rect extends Geometry {   //�̳У�Rect��ΪGeometry�������
	double a,b;
	Rect(double a, double b){   //���ι��췽��
		this.a = a;
		this.b = b;             //this
	}
	public double getArea(){
		return a * b;           //���ε�������̳еĳ����������д��
	}
}