class A {
	float computer(float x,float y){
		return x + y;
	}
	public int g(int x,int y){
		return x + y;
	}
}

class B extends A {   //�̳�
//	float computer(float x,float y,double z)   //ע����д�����ص�������д����ǿ��ǲ��ܱ�ģ�
	float computer(float x,float y){    //��д
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