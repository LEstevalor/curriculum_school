public class MainClass{
	public static void main(String args[]){
		Student zhang = new Student();
		double area =
		zhang.area(new Rect(2,3), new Circle(5.2), new Circle(12));  //Geometry�����������Ķ�����Դ�������������ã���������������ת�Ͷ���
		System.out.printf("S�� = %10.3f \n",area);      //�����Ǹ������ת�Ͷ���

		area =
        zhang.area(new Triangle(2,2,3), new Circle(5.2), new Circle(12));  //Geometry�����������Ķ�����Դ�������������ã���������������ת�Ͷ���
		System.out.printf("S�� = %10.3f \n",area);

	}
}