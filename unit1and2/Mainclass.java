//第二单元——课后第二题

public class Mainclass{
public static void main(String args[]){
double a1=12,b1=236,add;
double a2=234,b2=120,sub;
Teacher tea = new Teacher();
Student stu = new Student();
add = tea.add(a1,b1);
sub = tea.sub(a2,b2);
System.out.printf("和：%3f\t 差：%3f。\n",add,sub); 
stu.speak();
}

}