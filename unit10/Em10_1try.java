import java.io.*;
public class Em10_1try{
	public static void main(String args[]){
		//File类的三种构造方法
		File file1 = new File("10_1tryFile1.txt");                   
		File file2 = new File("D:\\java_load\\example\\curriculum_school\\unit10","happy.txt");
		File file3 = new File(file1,"10_1tryFile3.txt");                                      //运行后，目录里还没有出现前后2个txt文件
		/*  File(String filename)                      //默认同一目录下
		    File(String directoryPath, String filename)
		    File(File f, String filename)    */

		System.out.println("文件名字是：" + file2.getName());                                      
		System.out.println("文件可读否：" + file2.canRead() +  "\t文件可写否：" + file2.canWrite());    
		System.out.println("文件存在否：" + file2.exists());                 //
		System.out.println("文件长度（单位：字节）：" + file2.length());
		System.out.println("文件绝对路径：" + file2.getAbsolutePath());
		System.out.println("文件父目录：" + file2.getParent());
		System.out.println("文件是否为一普通文件，而非目录：" + file2.isFile());
		System.out.println("文件是否为一目录：" + file2.isDirectory());
		System.out.println("文件是否为隐藏文件：" + file2.isHidden());
		System.out.println("文件最后修改时间：" + file2.lastModified());
// 文件名字是：happy.txt
// 文件可读否：true        文件可写否：true
// 文件存在否：true
// 文件长度（单位：字节）：26
// 文件绝对路径：D:\java_load\example\curriculum_school\unit10\happy.txt
// 文件父目录：D:\java_load\example\curriculum_school\unit10
// 文件是否为一普通文件，而非目录：true
// 文件是否为一目录：false
// 文件是否为隐藏文件：false
// 文件最后修改时间：1635133280829

		System.out.println();

		System.out.println("文件名字是：" + file1.getName());                                      
		System.out.println("文件可读否：" + file1.canRead() +  "\t文件可写否：" + file1.canWrite());    
		System.out.println("文件存在否：" + file1.exists());                 //
		System.out.println("文件长度（单位：字节）：" + file1.length());
		System.out.println("文件绝对路径：" + file1.getAbsolutePath());
		System.out.println("文件父目录：" + file1.getParent());
		System.out.println("文件是否为一普通文件，而非目录：" + file1.isFile());
		System.out.println("文件是否为一目录：" + file1.isDirectory());
		System.out.println("文件是否为隐藏文件：" + file1.isHidden());
		System.out.println("文件最后修改时间：" + file1.lastModified());
// 文件名字是：10_1tryFile1.txt
// 文件可读否：false       文件可写否：false
// 文件存在否：false
// 文件长度（单位：字节）：0
// 文件绝对路径：D:\\java_load\\example\\curriculum_school\\unit10\\10_1tryFile1.txt
// 文件父目录：null
// 文件是否为一普通文件，而非目录：false
// 文件是否为一目录：false
// 文件是否为隐藏文件：false
// 文件最后修改时间：0
		}		
}