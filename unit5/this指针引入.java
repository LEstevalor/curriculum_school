public class this指针引入 {
	public static void main(String args[]) {
		Temp1 yy1 = new Temp1();
		Temp2 yy2 = new Temp2();
		yy1.f();
		yy2.g();
	}
}

class Temp1 {
	int x = 100;
	int y1;
	void f() {         //设置一个空函数
		int x = 1;     //局部变量（隐藏同名的成员变量）
		y1 = x + x;
		System.out.println("局部隐藏结果" + y1);
	}
}

class Temp2 {
	int x = 100;
	int y2;
	void g() {
		int x = 1;
		y2 = this.x + this.x;       //this.x代表的是被隐藏的成员变量
		System.out.println("用this指针结果" + y2);
	}
}

