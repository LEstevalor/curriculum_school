import java.io.*;
public class Em10_3{
	public static void main(String args[]){
		File file = new File("D:\\java_load\\example\\curriculum_school\\unit10","Em10_3.txt");
		try{
			file.createNewFile();   //������Ŀ¼�¡�û�еġ��ļ�����Ҫ�׳�     createNewFile()
		}
		catch(Exception exp){}
		file.delete();              //ɾ���ļ�Em10_3.txt                   delete()
	}
}

