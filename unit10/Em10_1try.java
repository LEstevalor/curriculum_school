import java.io.*;
public class Em10_1try{
	public static void main(String args[]){
		//File������ֹ��췽��
		File file1 = new File("10_1tryFile1.txt");                   
		File file2 = new File("D:\\java_load\\example\\curriculum_school\\unit10","happy.txt");
		File file3 = new File(file1,"10_1tryFile3.txt");                                      //���к�Ŀ¼�ﻹû�г���ǰ��2��txt�ļ�
		/*  File(String filename)                      //Ĭ��ͬһĿ¼��
		    File(String directoryPath, String filename)
		    File(File f, String filename)    */

		System.out.println("�ļ������ǣ�" + file2.getName());                                      
		System.out.println("�ļ��ɶ���" + file2.canRead() +  "\t�ļ���д��" + file2.canWrite());    
		System.out.println("�ļ����ڷ�" + file2.exists());                 //
		System.out.println("�ļ����ȣ���λ���ֽڣ���" + file2.length());
		System.out.println("�ļ�����·����" + file2.getAbsolutePath());
		System.out.println("�ļ���Ŀ¼��" + file2.getParent());
		System.out.println("�ļ��Ƿ�Ϊһ��ͨ�ļ�������Ŀ¼��" + file2.isFile());
		System.out.println("�ļ��Ƿ�ΪһĿ¼��" + file2.isDirectory());
		System.out.println("�ļ��Ƿ�Ϊ�����ļ���" + file2.isHidden());
		System.out.println("�ļ�����޸�ʱ�䣺" + file2.lastModified());
// �ļ������ǣ�happy.txt
// �ļ��ɶ���true        �ļ���д��true
// �ļ����ڷ�true
// �ļ����ȣ���λ���ֽڣ���26
// �ļ�����·����D:\java_load\example\curriculum_school\unit10\happy.txt
// �ļ���Ŀ¼��D:\java_load\example\curriculum_school\unit10
// �ļ��Ƿ�Ϊһ��ͨ�ļ�������Ŀ¼��true
// �ļ��Ƿ�ΪһĿ¼��false
// �ļ��Ƿ�Ϊ�����ļ���false
// �ļ�����޸�ʱ�䣺1635133280829

		System.out.println();

		System.out.println("�ļ������ǣ�" + file1.getName());                                      
		System.out.println("�ļ��ɶ���" + file1.canRead() +  "\t�ļ���д��" + file1.canWrite());    
		System.out.println("�ļ����ڷ�" + file1.exists());                 //
		System.out.println("�ļ����ȣ���λ���ֽڣ���" + file1.length());
		System.out.println("�ļ�����·����" + file1.getAbsolutePath());
		System.out.println("�ļ���Ŀ¼��" + file1.getParent());
		System.out.println("�ļ��Ƿ�Ϊһ��ͨ�ļ�������Ŀ¼��" + file1.isFile());
		System.out.println("�ļ��Ƿ�ΪһĿ¼��" + file1.isDirectory());
		System.out.println("�ļ��Ƿ�Ϊ�����ļ���" + file1.isHidden());
		System.out.println("�ļ�����޸�ʱ�䣺" + file1.lastModified());
// �ļ������ǣ�10_1tryFile1.txt
// �ļ��ɶ���false       �ļ���д��false
// �ļ����ڷ�false
// �ļ����ȣ���λ���ֽڣ���0
// �ļ�����·����D:\\java_load\\example\\curriculum_school\\unit10\\10_1tryFile1.txt
// �ļ���Ŀ¼��null
// �ļ��Ƿ�Ϊһ��ͨ�ļ�������Ŀ¼��false
// �ļ��Ƿ�ΪһĿ¼��false
// �ļ��Ƿ�Ϊ�����ļ���false
// �ļ�����޸�ʱ�䣺0
		}		
}