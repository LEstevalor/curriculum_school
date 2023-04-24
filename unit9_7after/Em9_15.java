import java.util.*;
import static java.util.Calendar.*;
public class Em9_15{
	public static void main(String args[]){
		Calendar calendar = Calendar.getInstance();    //Calendar类的static方法getInstance()可以初始化一个日历对象
	//	Calendar calendar = new Calendar();   //×，Calendar是抽象的; 无法实例化
		calendar.setTime(new Date());         //Calendar对象调用setTime()方法，设置入现在的时间（new Date()）
		String 年 = String.valueOf(calendar.get(YEAR)),
			   月 = String.valueOf(calendar.get(MONTH) + 1),         //0表示1月，以此类推。    
			   日 = String.valueOf(calendar.get(DAY_OF_MONTH));      //calendar对象的调用方法：calendar.get(YEAR/MONTH/DAY_OF_MONTH/DAY_OF_WEEK
	    int hour = calendar.get(HOUR_OF_DAY),                                                            //    /HOUR_OF_DAY/MINUTE/SECOND)
	        minute = calendar.get(MINUTE),                           //DAY_OF_WEEK 1表周日，2表周一。。。
	        second = calendar.get(SECOND);
	    System.out.print("The now time is: ");
	    System.out.print(年 + "年" + 月 + "月" + 日 + "日");
	    System.out.println(" " + hour + "时" + minute + "分" + second + "秒");
	    int year = 1949,
	        month = 9,
	        day = 1;
	    calendar.set(year,month - 1,day);
	    System.out.println(calendar.get(MONTH)); 
	    long time1 = calendar.getTimeInMillis();     //calendar.getTimeInMillis() 得到距离1970.1.1.08至calendar时的毫秒数
	    calendar.set(year + 60,month - 1,day);
	    long time2 = calendar.getTimeInMillis();
	    long 相隔天数 = (time2 - time1)/(1000 * 60 * 60 *24);    //毫秒-秒-分-时-天
	    System.out.println("2009.10.1与1949.10.1相隔天数：" + 相隔天数 + "天");
	    calendar.set(1970,0,1);
	    System.out.println(calendar.getTimeInMillis()/(8 * 60 * 60 * 1000));  //0
	}
}
        //本人删改
	    // year = 2009;
	    // month = 9;
	    // day = 1;