import java.util.regex.*;
class homework11{
	public static void main(String args[]){
/*		Pattern p;
		Matcher m;
		String regex = "[a-zA-Z]+";
		p = Pattern.compile(regex);          //注意1.返回类型；2.初始化
		String s = "ab123cde";
		m = p.matcher(s);
		String result = m.replaceAll("");
		System.out.println(result);   //123
*/
		String result = Pattern.compile("[a-zA-Z]+").matcher("ab123cde").replaceAll(""); //匹配模式对象.matcher(string).replaceAll(replacement);
		System.out.println(result);   //123
	}
}


