public class ConstructionBank extends Bank{
	double year;
	public double computerInterest(){
		super.year = (int)year;
		double remainNumber = year - (int)year;
		int day = (int)(remainNumber * 1000);
		interest = super.computerInterest() + day * 0.0001 * saveMoney;
		System.out.printf("%d元存在建设银行%d年零%d天的利息：%f.\n",
							saveMoney, super.year, day, interest);
		return interest;
	}
}