import java.util.Scanner;

public class Em9_9{
	public static void main(String args[]){
		String regex = "[a-zA-Z]+";        //[a-zA-Z]正则表达式(其中+在这里不能缺)
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();   //输入字符
		if(str.matches(regex)){            //string.matches(regex) 字符串对象与正则表达式匹配
			System.out.println(str + " 字符全是英文");
		}
	}
}

