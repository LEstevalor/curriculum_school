public class Circle {
	double radius;     //�뾶
	double area;       //���

	Circle() {         //�����βεĹ��췽��
	}

	Circle(double r) { //���βεĹ��췽��
		radius = r;
	}

	void setRadius(double r) {  //�����������ð뾶
		if(r > 0){
			radius = r;
		} 
	}

	double getRadius() {        //���������õ��뾶ֵ
		return radius;
	}

	double getArea() {          //���������õ����ֵ
		area = 3.14 * radius * radius;
		return area;
	}
}