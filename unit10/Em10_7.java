import java.io.*;                       
public class Em10_7{   
	public static void main(String args[]){             //BufferedWriter流写入，BufferedReader流读出
		File file = new File("Student.txt");
		String content[] = {"商品列表","电视机，2567元/台","洗衣机，3562元/台","冰箱，6573元/台"};
		try{                                                      //构造方法↓
			FileWriter outOne = new FileWriter(file);             //BufferedReader(Reader in)              
			BufferedWriter outTwo = new BufferedWriter(outOne);   //BufferedWriter(Writer out)     
			for(String str:content){                                //注意这里FileReader/FileWriter为Reader/Writer子类  所以可以传参                        
				outTwo.write(str);                                                           
				outTwo.newLine();                //BufferedWriter流独特的方法 ： newLine()   —— 写入一个回行符
			}
			outTwo.close();
			outOne.close();
			FileReader inOne = new FileReader(file);
			BufferedReader inTwo = new BufferedReader(inOne); 
			String s = null;                                 //相较于write(string)，BufferedReader类方法——write(String,int,int)写入s,偏移a,字符数b
			while((s = inTwo.readLine()) != null){           //BufferedReader流读取文本行——readLine()方法
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

