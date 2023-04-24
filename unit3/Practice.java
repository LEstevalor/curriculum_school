// 输入若干数字，每输一次需用一次回车，输入非数字字符串结束，计算数和与平均值

import java.util.*;

public class Practice{
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
double sum = 0;
int m = 0;
while(reader.hasNextDouble()){   //输入非数字后reader.hasNextDouble()值为false
double x = reader.nextDouble();
m = m + 1;
sum = sum +x;
}
System.out.printf("%d个数和为%f。\n",m,sum);
System.out.printf("%d个数平均值为%f。\n",m,sum/m);
}
}