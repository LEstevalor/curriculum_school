public class Example2_1
{
public static void main(String args[])
{
Circle1 circleone , circletwo;
circleone = new Circle1();          //��������
circletwo = new Circle1();
circleone.radius = 123.86;
circletwo.radius = 69;
double area = circleone.getarea();
System.out.println("circleone�����" + area);
area = circletwo.getarea();
System.out.println("circleone�����" + area);
}
}


