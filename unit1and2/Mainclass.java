//�ڶ���Ԫ�����κ�ڶ���

public class Mainclass{
public static void main(String args[]){
double a1=12,b1=236,add;
double a2=234,b2=120,sub;
Teacher tea = new Teacher();
Student stu = new Student();
add = tea.add(a1,b1);
sub = tea.sub(a2,b2);
System.out.printf("�ͣ�%3f\t �%3f��\n",add,sub); 
stu.speak();
}

}