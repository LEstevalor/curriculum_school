import java.util.regex.*;    //包含Pattern类和Matcher类的包
public class Em9_19{
	public static void main(String args[]){
		Pattern p;           //模式对象
		Matcher m;           //匹配对象
		String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		p = Pattern.compile(regex);           //初始化模式对象
		String s = "清华大学网址:www.tsinghua.edu.cn,邮电出版社的网址:http://www.ptpress.com";
		m = p.matcher(s);                     //用待匹配字符序列初始化匹配对象
		while(m.find()){
			String str = m.group();
			System.out.println(str);
		}    
		System.out.println("剔除字符串中的网站地址后得到的字符串:");
		String result = m.replaceAll(" ");
		System.out.println(result);
	}
}
/*
模式匹配：
1 Pattern类创建一个对象——模式对象（正则表达式的封装）；
2 Pattern.compile(String regex)返回模式对象（regex是正则表达式）；（也有类方法，compile(String regex,int flags)）

匹配对象：
Matcher创建对象 = Pattern对象.matcher(字符串) —— 匹配对象;
↓对应方法 —— boolean类型的find()/matches()/lookingAt()/find(int start);
            String类型的replaceAll(String replacement)/replaceFirst(String replacement);
*/


            
