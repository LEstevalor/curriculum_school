public class Bank{
	int saveMoney;
	int year;
	double interest;
	public double computerInterest() {
		interest = year * 0.035 * saveMoney;
		System.out.printf(" %d元存在银行%d年的利息：%f.\n ",
							saveMoney, year, interest);
		return interest;
	}
}