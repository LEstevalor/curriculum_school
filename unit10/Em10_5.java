import java.io.*;
public class Em10_5{
	public static void main(String args[]){
		byte []a = "����60����".getBytes();
		byte []b = "ʮһ����".getBytes();

		/* ���ֹ��췽����(���FileInputStream) 
        	FileOutputStream(String name)  /  FileOutputStream(File file)
        */
		try{
			FileOutputStream out = new FileOutputStream("happy.txt");
			out.write(a);
			out.write(b,0,b.length);
			out.close();                                               //ÿ��ʹ�û�ˢ���ļ�happy.txt
		}
		catch(IOException exp){
			System.out.println("Error " + exp);
		}
	}
}