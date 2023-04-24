public class Example6_4 {
	public static void main(String args[]){
		int amount = 5000;
		ConstructionBank bank1 = new ConstructionBank();
		bank1.saveMoney = amount;
		bank1.year =  5.216;
		double interest1 = bank1.computerInterest();
		BankofDalian bank2 = new BankofDalian();
		bank2.saveMoney = amount;
		bank2.year = 5.216;
		double interest2 = bank2.computerInterest();
		System.out.printf("两个银行利息相差%f元\n", Math.abs(interest2 - interest1));
	}
}