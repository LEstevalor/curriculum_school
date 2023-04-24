import java.io.*;
public class Em10_2{
	public static void main(String args[]){
		File dir = new File(".");
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");
		String fileName[] = dir.list(fileAccept);
		for(String name:fileName){
			System.out.println(name);
		}
	}
}
class FileAccept implements FilenameFilter{
	private String extendName;
	public void setExtendName(String s){
		extendName = "." + s;
	}
	public boolean accept(File dir,String name){      //重写接口中的方法
		return name.endsWith(extendName);
	}
}