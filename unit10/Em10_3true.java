import java.io.*;
public class Em10_3true{
	public static void main(String args[]){
		try{
			Runtime ce = Runtime.getRuntime();         //Runtime类创建对象的方法：Runtime.getRuntime()                                         
			File file = new File("D:\\软件下载\\Auto大湾区杯\\Auto-Trader","Auto-Trader.exe");  //若只有D:\\软件下载，执行不了
			ce.exec(file.getAbsolutePath());           //Runtime对象可调用exec(String command)方法打开本地执行文件或执行一个操作
		}
		catch(Exception e){
			System.out.println("123456789");
		}
	}
}

