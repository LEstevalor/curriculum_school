interface ShowMessage {          //接口
	void 显示商标(String s);      //public 抽象方法
	void name();
}

class Abab{
	public void haha(ShowMessage a){  //接口类型参数
		a.name();                     //接口回调
	}                                           //遇到有类的方法的参数的很烦
}


class TV implements ShowMessage{
	public void 显示商标(String s){   //注意这里的public不能漏（不能减低访问权限）
		System.out.println(s);         
	}
	public void name(){
		System.out.println("TV");
	}
}

class PC implements ShowMessage{
	public void 显示商标(String s){
		System.out.println(s);         
	}
	public void name(){
		System.out.println("PC");
	}
}

public class Example7_2{
	public static void main(String args[]){
		ShowMessage sm;                //说明接口变量
		sm = new TV();                 //接口变量中存放对象的引用（接口的类的实例的引用）
		sm.显示商标("长城牌电视机");     //接口回调
		sm = new PC();
		sm.显示商标("奔月");            //接口回调的方法，不仅仅是操作上简单，而且可能还会与内存、运行速度有关（我猜的）

		Abab abab = new Abab();
		abab.haha(new TV());           //参数 —— 接口的类的实例的引用
		TV ab = new TV();
		ab.显示商标("长城牌电视机");

	}
}

