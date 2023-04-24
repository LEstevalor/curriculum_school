class B {
	int n;
	static int sum = 0;        //类变量（静态变量）
	void setN(int n) {
		this.n = n;
	}
	int getSum() {             //友好方法 — — 累加
		for(int i = 1;i <= n; i++){
			sum += i;               
		}
		return sum;
	}
}

public class AA {
	public static void main(String args[]){
		B b1 = new B(), b2 = new B();
		b1.setN(3);
		b2.setN(5);
		int s1 = b1.getSum();     //6
		int s2 = b2.getSum();     //这里需要十分注意，此时的类变量sum = 6(静态变量)（程序退出运行才被释放），21（6 + 15）
		System.out.println(s1 + s2);    //27 (易错题)
	}
}

