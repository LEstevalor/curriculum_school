public class Student{
	public double area(Geometry ...p){        //������������������Ĳ������ͱ����ΪGeometry��
		double sum = 0;
		for(int i = 0; i < p.length; i++){    //�ü��ɣ���length�������������
			sum += p[i].getArea();
		}
		return sum;
	}
}