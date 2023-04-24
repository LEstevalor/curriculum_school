import java.util.Scanner;

public class InputData {
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
int amount = 0;
float price = 0,sum = 0;
System.out.println("输入产品数量\t（回车确认）");  //\t有效
amount = reader.nextInt();
System.out.println("输入产品单价（回车确认）\n");  //换行符有效
price = reader.nextFloat();
sum = price * amount;
System.out.printf("数量：%d , 单价：%5.2f , 总价：%5.2f\n",amount,price,sum);
}                      //\n换行符有效
}