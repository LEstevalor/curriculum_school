import java.io.*;
public class Em10_4{
	public static void main(String args[]){
		int n = -1;
		byte []a = new byte[100];

        /* 两种构造方法： 
        	FileInputStream(String name)  /  FileInputStream(File file)
        */

		try{
//			FileInputStream in = new FileInputStream("Em10_4.java");
			FileInputStream in = new FileInputStream(new File("Em10_4.java"));
			while((n = in.read(a,0,100)) != -1){         //文件读取方法，fileInputStream.read方法
				String s = new String(a,0,n);
				System.out.print(s);
			}
			in.close();
		}
		catch(IOException exp){
			System.out.println("File read Error" + exp);
		}
	}
}



