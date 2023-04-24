import java.io.*;
public class Em10_3{
	public static void main(String args[]){
		File file = new File("D:\\java_load\\example\\curriculum_school\\unit10","Em10_3.txt");
		try{
			file.createNewFile();   //创建该目录下“没有的”文件，需要抛出     createNewFile()
		}
		catch(Exception exp){}
		file.delete();              //删除文件Em10_3.txt                   delete()
	}
}

