public class E8_5{
	public static void main(String args[]){
		B bank = new B();
		try{
			bank.income(200,-100);
			bank.income(300,-100);
			System.out.println("����Ǯ��" + bank.money);
			bank.income(200,100);      //�����쳣��תȥִ��catch
			bank.income(99999,-100);   //����ִ��
		}
		catch(BE e){
			System.out.println(e.warnMess());
		}
		System.out.println("����Ǯ��" + bank.money);
	}
}
