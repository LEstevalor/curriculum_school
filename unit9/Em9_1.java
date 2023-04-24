public class Em9_1{
	public static void main(String args[]){
		String s1,s2;
		s1 = new String("天道酬勤");     
		s2 = new String("天道酬勤");     
		System.out.println(s1.equals(s2));   //ture
		System.out.println(s1 == s2);        //false
		String s3,s4;
		s3 = "勇者无敌";
		s4 = "勇者无敌";
		System.out.println(s3.equals(s4));   //ture
		System.out.println(s3 == s4);        //ture

		System.out.println();
		String v = new String("阿巴阿啊巴");
		System.out.println(v.endsWith("阿巴")); //false
		System.out.println(v.contains("阿巴")); //true

		String a = "ad", c = "dd";
		System.out.println(a.compareTo(c));  //-3
		System.out.println(a.substring(0,1));//a
		System.out.println(c.indexOf("d",0));//0

		a = "  ad ";
		System.out.println(a.trim());     //结果是ad
		

	}   //字符串常量是对象，因此可以把字符串常量的引用赋值给一个字符串变量
}

