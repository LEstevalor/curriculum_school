import java.io.*;
public class Em10_3true{
	public static void main(String args[]){
		try{
			Runtime ce = Runtime.getRuntime();         //Runtime�ഴ������ķ�����Runtime.getRuntime()                                         
			File file = new File("D:\\�������\\Auto��������\\Auto-Trader","Auto-Trader.exe");  //��ֻ��D:\\������أ�ִ�в���
			ce.exec(file.getAbsolutePath());           //Runtime����ɵ���exec(String command)�����򿪱���ִ���ļ���ִ��һ������
		}
		catch(Exception e){
			System.out.println("123456789");
		}
	}
}

