import java.io.*;                       
public class Em10_7{   
	public static void main(String args[]){             //BufferedWriter��д�룬BufferedReader������
		File file = new File("Student.txt");
		String content[] = {"��Ʒ�б�","���ӻ���2567Ԫ/̨","ϴ�»���3562Ԫ/̨","���䣬6573Ԫ/̨"};
		try{                                                      //���췽����
			FileWriter outOne = new FileWriter(file);             //BufferedReader(Reader in)              
			BufferedWriter outTwo = new BufferedWriter(outOne);   //BufferedWriter(Writer out)     
			for(String str:content){                                //ע������FileReader/FileWriterΪReader/Writer����  ���Կ��Դ���                        
				outTwo.write(str);                                                           
				outTwo.newLine();                //BufferedWriter�����صķ��� �� newLine()   ���� д��һ�����з�
			}
			outTwo.close();
			outOne.close();
			FileReader inOne = new FileReader(file);
			BufferedReader inTwo = new BufferedReader(inOne); 
			String s = null;                                 //�����write(string)��BufferedReader�෽������write(String,int,int)д��s,ƫ��a,�ַ���b
			while((s = inTwo.readLine()) != null){           //BufferedReader����ȡ�ı��С���readLine()����
				System.out.println(s);
			}
			inOne.close();
			inTwo.close();
		} 
		catch(IOException e){
			System.out.println(e);
		}
	}
}

