public class RCF{                //包含内部类的类——外嵌类
	String formName;
	RedCow cow;                  //内部类声明对象
	RCF(){
	}
	RCF(String s){
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess(){
		cow.speak();
	}
	class RedCow{               //内部类的声明
		String cowName = "红牛";    //注意内部类不能声明类变量和类方法，且仅供它的外嵌类使用。
		int h,w,p;
		RedCow(int h,int w,int p){
			this.h = h;
			this.w = w;
			this.p = p;
		}
		void speak(){
			System.out.println("是" + cowName + "高" + h);
		}
	}
}

