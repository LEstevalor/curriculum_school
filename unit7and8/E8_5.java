public class E8_5{
	public static void main(String args[]){
		B bank = new B();
		try{
			bank.income(200,-100);
			bank.income(300,-100);
			System.out.println("银行钱：" + bank.money);
			bank.income(200,100);      //出现异常，转去执行catch
			bank.income(99999,-100);   //不被执行
		}
		catch(BE e){
			System.out.println(e.warnMess());
		}
		System.out.println("银行钱：" + bank.money);
	}
}
