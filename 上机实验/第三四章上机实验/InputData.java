import java.util.Scanner;

public class InputData {
public static void main(String args[]){
Scanner reader = new Scanner(System.in);
int amount = 0;
float price = 0,sum = 0;
System.out.println("�����Ʒ����\t���س�ȷ�ϣ�");  //\t��Ч
amount = reader.nextInt();
System.out.println("�����Ʒ���ۣ��س�ȷ�ϣ�\n");  //���з���Ч
price = reader.nextFloat();
sum = price * amount;
System.out.printf("������%d , ���ۣ�%5.2f , �ܼۣ�%5.2f\n",amount,price,sum);
}                      //\n���з���Ч
}