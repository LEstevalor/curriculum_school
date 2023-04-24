import java.util.*;
public class Em9_13{
	public static void main(String args[]){                     //构造方法↓
		String s = "you are welcome\n, nice to meet you";   //StringTokenizer(String)   为s构造分析器，用默认分隔符：空格、换行、回车、Tab、进纸 符 
                                                            //StringTokenizer(String,String)          用s2为分隔符
		StringTokenizer fenxi = new StringTokenizer(s);           

//		StringTokenizer fenxi = new StringTokenizer(s," "); //会发现\n没有作为分隔符，换行生效，“welcome\n,”算为一个

		System.out.println(fenxi.nextToken());              // fenxi.nextToken() 用分析器获取字符串中语言符号（即单词）——注：获取1个，分析器中就少一个
		int num = fenxi.countTokens();                      // fenxi.countTokens() 分析器计数语言符号
		while(fenxi.hasMoreTokens()){                       // fenxi.hasMoreTokens() 分析器有语言符号就返回ture，否则false
			String str = fenxi.nextToken();
			System.out.print(str + " | ");
		}  
		System.out.println("数量：" + num);
	}
}

