class Sum {
	int x,y,z;                 //类方法不可操控实例变量，因类创建对象前，实例成员变量并未分配内存
	static int getContinueSum(int start,int end) {   //类方法（静态方法）（在类型前加了static关键字的）
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

public class Example5_8 {
	public static void main(String args[]) {     //对比普通的类下的方法（实例方法）有什么不同？
		int result = Sum.getContinueSum(0,100);  //会发现，这里是直接通过类名调用方法的，并没有创建对象
		System.out.println(result);  
	}
}
