import java.util.*;
class homework9{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �� ��");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
	    System.out.println("��������һ�� �� ��");
	    int year_ = scanner.nextInt();
		int month_ = scanner.nextInt();
		int day_ = scanner.nextInt();
	    Calendar calendar = Calendar.getInstance();
	    Calendar calendar_ = Calendar.getInstance();
	    calendar.set(year,month - 1,day);
	    calendar_.set(year_,month_ - 1,day_);                          //getTimeInMillis()��������Ϊlongע��
	    long distanceTime = (calendar.getTimeInMillis() - calendar_.getTimeInMillis())/(1000 * 60 * 60 * 24);	
	    System.out.println(Math.abs(distanceTime) + "��Ϊ�������");    //Math.abs()
	}
}