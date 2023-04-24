public class Student{
	public double area(Geometry ...p){        //可输入多参数（在这里的参数类型必须均为Geometry）
		double sum = 0;
		for(int i = 0; i < p.length; i++){    //好技巧，用length来计算总面积和
			sum += p[i].getArea();
		}
		return sum;
	}
}