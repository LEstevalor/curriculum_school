import java.util.Scanner;

public class Example3_4{
public static void main(String args[]){
People fulin = new People();              //��������
Scanner reader = new Scanner(System.in);  //������ȡ�û��������ݵĶ���
System.out.println("�������䣬�س�ȷ��");
fulin.age = reader.nextInt();             
System.out.println("�������أ��س�ȷ��");
fulin.weight = reader.nextFloat();        //��ʹ��nextDoubleʱ�������Ϊfloat����
fulin.announce();
}
}

/*
import java.util.Scanner;

public class Example3_4{
    public static void main(String args[]){
        People fulin = new People();
        Scanner reader = new Scanner(System.in);
        System.out.println("�������䣬�س�ȷ��");
        fulin.age = reader.nextInt();
        System.out.println("�������أ��س�ȷ��");
        fulin.weight = reader.nextFloat();
        fulin.annouce();
    }
}
*/

