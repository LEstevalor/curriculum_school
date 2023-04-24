import java.io.*;
public class Em10_2try{
	public static void main(String args[]){
		File file1 = new File("Em10_2tryFile1");     
		boolean a = file1.mkdir();            
		System.out.println("创建目录：" + a);      
		/* file.mkdir()  （File对象创建目录 -》 成功true、失败/目录已存在false）

		  String[] list()字符串返回目录下全部文件1
		  File[] listFiles()File对象形式返回目录下全部文件2
		  方法1、2都可以加入参数 FilenameFilter obj指定文件类型
		*/

		File file2 = new File("D:\\java_load\\example\\curriculum_school\\unit10");  //不在同目录（父目录），应该指定路径
	//	System.out.println(file2.exists());测试代码
		String []b = file2.list();      
		for(String string:b){
			System.out.println(string); //unit10目录下全部文件
		}
	}
}


