public class Em9_6{
	public static void main(String args[]){
		char []a,b,c;
		String s ="2009年10月1日是国庆60周年";
		a = new char[2];                                              //注意↓：必须保证string2足够容纳
		s.getChars(11,13,a,0);      //string1.getChars(m,n,string2,x)  字符串string1[m]~[n]位置上的字符放入（string2从[x]处开始）。【如[0]】 
		System.out.println(a);
		c = "十一长假".toCharArray();    // []c = "十一长假" 《———— toCharArray()方法
        //		[]c = "十一长假";      //错误，非法的表达式
		System.out.println(c);
		for(char ch:c){
			System.out.print(ch);
		} 
	}
}