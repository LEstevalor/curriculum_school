import java.io.*;
public class Em10_2try{
	public static void main(String args[]){
		File file1 = new File("Em10_2tryFile1");     
		boolean a = file1.mkdir();            
		System.out.println("����Ŀ¼��" + a);      
		/* file.mkdir()  ��File���󴴽�Ŀ¼ -�� �ɹ�true��ʧ��/Ŀ¼�Ѵ���false��

		  String[] list()�ַ�������Ŀ¼��ȫ���ļ�1
		  File[] listFiles()File������ʽ����Ŀ¼��ȫ���ļ�2
		  ����1��2�����Լ������ FilenameFilter objָ���ļ�����
		*/

		File file2 = new File("D:\\java_load\\example\\curriculum_school\\unit10");  //����ͬĿ¼����Ŀ¼����Ӧ��ָ��·��
	//	System.out.println(file2.exists());���Դ���
		String []b = file2.list();      
		for(String string:b){
			System.out.println(string); //unit10Ŀ¼��ȫ���ļ�
		}
	}
}


