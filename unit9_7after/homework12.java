import java.util.*;  //ע�⣺���ﲻ��ֻ�ǵ���Scanner�࣬����Ҳ�õ�InputMismatchException�࣬�������ֱ�ӵ���������
class homework12{
	public static void main(String args[]){
		String string = "��ѧ87�֣�����76�֣�Ӣ��96��";
		Scanner scanner = new Scanner(string);
		scanner.useDelimiter("[^0123456789]+");  //ƥ������ֲ���
		double sum = 0;    //�ܷ�
		double number = 0; //��Ŀ��
		double average = 0;//ƽ����
		while(scanner.hasNext()){
			try{
				double temp = scanner.nextInt();
				number += 1;
				sum += temp;
			}
			catch(InputMismatchException exp){
				String temp_ = scanner.next();
			}
		}
		average = sum/number;
		System.out.println("All fraction:" + sum);     
		System.out.println("Average fraction:" + average);
	}
}