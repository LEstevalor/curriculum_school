import java.util.*;
public class LianXi{
	public static void main(String args[]){
	Scanner reader = new Scanner(System.in);
	double sum = 0;
	int m = 0;
	while(reader.hasNextDouble()){
		double x = reader.nextDouble();
		m += 1;
		sum += m;
	}
	System.out.printf("%d�������ܺ�Ϊ%f\n",m,sum);
	System.out.printf("%d������ƽ��ֵΪ%f\n",m,sum/m);
	}
}