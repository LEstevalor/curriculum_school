public class Emmmm9{                        //StringBuffer的append方法
	public static void main(String args[]){
		StringBuffer a = new StringBuffer("我踢足球和");
		System.out.println(a.append("打篮球"));    //我踢足球和打篮球       1① append(String s) 返回当前对象的引用    
		System.out.println(a.append(123));        //我踢足球和打篮球123    2② append(int n) int数据变为字符串后追加，再同上面的步骤
		String b = "456";
		System.out.println(a.append(b));          //我踢足球和打篮球123456 3③ append(Object o) 对象的字符串追加，返回当前对象的引用

		short c = 1;
		System.out.println(a.append(c));          //我踢足球和打篮球1234561
		//由2②可类推，long,boolean,float,double,char,short.byte也可以和2②那样使用。
	}
}


