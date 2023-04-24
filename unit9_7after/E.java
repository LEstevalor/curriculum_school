import java.util.*;
public class E{
	public static void main(String args[]){
		String s1 = "苹果5.67圆，香蕉：12圆，芒果：19.8圆";
		String s2 = "酱油6.7圆，精盐：0.8圆，榨菜：9.8圆";
		// StringTokenizer fenxi1 = new StringTokenizer(s1,":，");    //无法用异常处理的方式把string1分隔开
		// double sum = 0;                      
		// while(fenxi1.hasMoreTokens()){
		// 	try{
		// 		sum += parseDouble(fenxi1.nextToken()); 
		// 	}
		// 	catch(Exception exp){
		// 		String t = fenxi1.next();  //StringTokenizer类无next()方法
		// 	}                                  
		// }
		ComputePice jisuan = new ComputePice();
		String regex = "[^0123456789.]+";       //匹配所有非数字字符串
		String s1_number = s1.replaceAll(regex,"*");
		double priceSum = jisuan.compute(s1_number,"*");
		System.out.printf("\"%s\"价格总和:\n%f圆\n",s1,priceSum);
		String s2_number = s2.replaceAll(regex,"#");
	 	priceSum = jisuan.compute(s2_number,"#");
		System.out.printf("\"%s\"价格总和:\n%f圆\n",s2,priceSum);

		regex = "[0123456789.]+圆";
		String str = s1.replaceAll(regex," ");
		str = str.replaceAll("，","");
		str = str.replaceAll("：","");   //这种replaceAll("，：","")达不到效果
		System.out.println(str);      //苹果 香蕉 芒果

	}
}
class ComputePice{
	double compute(String s,String fenge){
		StringTokenizer fenxiOne = new StringTokenizer(s,fenge);
		double sum = 0;
		double digitItem = 0;
		while(fenxiOne.hasMoreTokens()){
			String str = fenxiOne.nextToken();
			digitItem = Double.parseDouble(str);
			sum += digitItem;
		}
		return sum;
	}
}