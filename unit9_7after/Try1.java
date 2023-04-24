import java.text.*;  //DecimalFormat类在java.text包内x
public class Try1{   //格式化整数位和小数位
	public static void main(String args[]){
		DecimalFormat format = new DecimalFormat("000.00");  //DecimalFormat(最少整数位.保留小数位)
		String result1 = format.format(9966.666);            //String format(double number)    DecimalFormat对象调用方法
		System.out.println(result1);                //9966.67(四舍五入，却则补零）
		System.out.println(format.format(66.6));    //066.60 (最少整数位，却则补零）
		new Try1_2().try2();    
		Try1_3.try3();          
		new Try1_4();           
	}
}
class Try1_2{        //整数位的分组
	void try2(){
		DecimalFormat format = new DecimalFormat("#,###,###0.00"); //("#,#####,##00.00")一样，只由不包括小数点后的最终位#0数决定分类		                                                         
		String result = format.format(123456789.99); //1,2345,6789.99    //###0四位
		System.out.println(result);                                //注"##0.00"并不会使23.33变成023.33
	}
}
class Try1_3{        //百分数、千分数
	static void try3(){
		DecimalFormat format = new DecimalFormat("#00.00%");  //输出百分数，格式化后面添加“%” 
		String result = format.format(12.345678);     
		System.out.println(result);      //1234.57%
                                                              //输出千分数，格式化后面添加“\u2030”     
		System.out.println(new DecimalFormat("哈哈#00.00\u2030格局").format(12.345678));     //哈哈12345.68‰格局 
	}                                                         //除“# . , 0”外随便加符号
}
class Try1_4{         //科学计数法
	Try1_4(){
		DecimalFormat format = new DecimalFormat("0.0E0");     //科学计数法，格式化后面添加“E0”
		String result = format.format(123.45);   
		System.out.println(result);	     //1.2E2
		try{                                      // try catch语句↓                                                 ——————》格式化变为数字
			Number num = format.parse("1.2E2");   //必须对其进行捕获或声明以便抛出    //这里得到的 num=120 为 Number 类型
			double b = num.doubleValue();         //Number 对象 = 格式化对象.parse(要转换的字符串);
			System.out.println(num);              //double 结果 = 对象.doubleValue();  //结果由Number类型变为Double类型
		}
		catch(Exception exp){}		
	}
}

