class B {
	int x = 100, y = 200;
	public void setX(int x){
		x = x;                //类的成员变量与参数同名，却没有用this（赋值无效） 
	}
	public void setY(int y){
		this.y = y;           //this.y成功赋值
	}
	public int getXYSum(){
		return x + y;
	}
}

public class A{
	public static void main(String args[]){
		B b = new B();
		b.setX(-100);            //b.x = 100;
		b.setY(-200);            //b.y = -200;
		System.out.println("Result is " + b.getXYSum()); //100 
	}
}

S