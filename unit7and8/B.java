public class B{
	int money;
	public void income(int in,int out) throws BE{    //throws�����쳣
		if( in <= 0 || out >= 0 || in + out <= 0){   
			throw new BE(in,out);                    //�����׳��쳣�����·�������
		}                                            //���沿�־��޷����г����
	int netIncome = in + out;
	System.out.printf("�����룺%dԪ\n",netIncome);
	money += netIncome;
	}
	public int getMoney(){
		return money;
	}
}