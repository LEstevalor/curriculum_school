class A {
	float computer(float x,float y){
		return x + y;
	}
	public int g(int x,int y){
		return x + y;
	}
}

class B extends A {   //继承
//	float computer(float x,float y,double z)   //注意重写和重载的区别（重写的外壳可是不能变的）
	float computer(float x,float y){    //重写
		return x * y;
	}
}

public class Example6_3 {
	public static void main(String args[]) {
		B b = new B();
		double result = b.computer(8,9);
		System.out.println(result);
		int m = b.g(12,8);
		System.out.println(m);
	}
}