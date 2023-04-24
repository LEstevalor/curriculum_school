import java.io.*;
class Em10_1{
	public static void main(String args[]){
		File f = new File("D:\\java_load\\example\\curriculum_school","Em10_1.java");
		System.out.println(f.getName() + "可读吗：" + f.canRead());
		System.out.println(f.getName() + "的长度：" + f.length());
		System.out.println(f.getName() + "的绝对路径" + f.getAbsolutePath());
		File file = new File("new.txt");
		System.out.println("在当前目录下创建新文件" + file.getName());
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("创建成功");
			}
			catch(IOException exp){}
		}
	}
}
/*
对象：文件↓
getName()获取名
canRead()是否可读
canWrite()是否可写
exists()是否存在
length()长度
getAbsolutePath()绝对路径
getParent()父目录
isFile()是否为一个普通文件，而不是目录
isDirectory()是否为一个目录
isHidden()是否为隐藏文件
lastModified()获取最后修改时间（从1970...到那时的毫秒数）
*/
