public class B{
	int money;
	public void income(int in,int out) throws BE{    //throws声明异常
		if( in <= 0 || out >= 0 || in + out <= 0){   
			throw new BE(in,out);                    //方法抛出异常，导致方法结束
		}                                            //后面部分均无法运行出结果
	int netIncome = in + out;
	System.out.printf("纯收入：%d元\n",netIncome);
	money += netIncome;
	}
	public int getMoney(){
		return money;
	}
}