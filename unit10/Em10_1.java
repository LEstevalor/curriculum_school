import java.io.*;
class Em10_1{
	public static void main(String args[]){
		File f = new File("D:\\java_load\\example\\curriculum_school","Em10_1.java");
		System.out.println(f.getName() + "�ɶ���" + f.canRead());
		System.out.println(f.getName() + "�ĳ��ȣ�" + f.length());
		System.out.println(f.getName() + "�ľ���·��" + f.getAbsolutePath());
		File file = new File("new.txt");
		System.out.println("�ڵ�ǰĿ¼�´������ļ�" + file.getName());
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("�����ɹ�");
			}
			catch(IOException exp){}
		}
	}
}
/*
�����ļ���
getName()��ȡ��
canRead()�Ƿ�ɶ�
canWrite()�Ƿ��д
exists()�Ƿ����
length()����
getAbsolutePath()����·��
getParent()��Ŀ¼
isFile()�Ƿ�Ϊһ����ͨ�ļ���������Ŀ¼
isDirectory()�Ƿ�Ϊһ��Ŀ¼
isHidden()�Ƿ�Ϊ�����ļ�
lastModified()��ȡ����޸�ʱ�䣨��1970...����ʱ�ĺ�������
*/
