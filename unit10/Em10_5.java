import java.io.*;
public class Em10_5{
	public static void main(String args[]){
		byte []a = "国庆60周年".getBytes();
		byte []b = "十一快乐".getBytes();

		/* 两种构造方法：(类比FileInputStream) 
        	FileOutputStream(String name)  /  FileOutputStream(File file)
        */
		try{
			FileOutputStream out = new FileOutputStream("happy.txt");
			out.write(a);
			out.write(b,0,b.length);
			out.close();                                               //每次使用会刷新文件happy.txt
		}
		catch(IOException exp){
			System.out.println("Error " + exp);
		}
	}
}