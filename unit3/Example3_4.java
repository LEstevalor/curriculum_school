import java.util.Scanner;

public class Example3_4{
public static void main(String args[]){
People fulin = new People();              //创建对象
Scanner reader = new Scanner(System.in);  //创建读取用户输入数据的对象
System.out.println("输入年龄，回车确认");
fulin.age = reader.nextInt();             
System.out.println("输入体重，回车确认");
fulin.weight = reader.nextFloat();        //当使用nextDouble时，结果仍为float类型
fulin.announce();
}
}

/*
import java.util.Scanner;

public class Example3_4{
    public static void main(String args[]){
        People fulin = new People();
        Scanner reader = new Scanner(System.in);
        System.out.println("输入年龄，回车确认");
        fulin.age = reader.nextInt();
        System.out.println("输入体重，回车确认");
        fulin.weight = reader.nextFloat();
        fulin.annouce();
    }
}
*/

