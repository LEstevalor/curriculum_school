import java.util.Date;
import java.text.SimpleDateFormat;   //注意会调这个类
public class Date9{
	public static void main(String args[]){
		Date nowTime = new Date();                                       //Date类无参数构造方法——↓本地时间
		System.out.println("现在广州时间是" + nowTime);    // 现在广州时间是Tue Oct 19 16:34:09 CST 2021

		System.out.println(System.currentTimeMillis());	 //从1970年1月1日08时到现在走过的毫秒数 // 1634632449335
                                                         //System.currentTimeMillis()↑
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);    //SimpleDateFormat(String pattern) —— 常用的构造方法
		String timePattern = SDF.format(nowTime);                // format(Date data)方法 —— 格式化
		System.out.println(timePattern);                // 2021-10-19

		pattern = "G yyyy年MMMd日E hh时mm分ss秒z";
		SDF = new SimpleDateFormat(pattern);
		timePattern = SDF.format(nowTime);
		System.out.println(timePattern);                // 公元 2021年10月19日周二 04时34分09秒CST
	}
}

