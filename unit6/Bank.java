public class Bank{
	int saveMoney;
	int year;
	double interest;
	public double computerInterest() {
		interest = year * 0.035 * saveMoney;
		System.out.printf(" %dԪ��������%d�����Ϣ��%f.\n ",
							saveMoney, year, interest);
		return interest;
	}
}