public class Em9_3{
	public static void main(String args[]){
		String path = "c:\\book\\javabook\\Java Programmer.doc";
		System.out.println(path);                                //c:\book\javabook\Java Programmer.doc(���������Ҳֻ�����)

		int index = path.indexOf("\\");
		System.out.println(index);                               //2
		
		index = path.indexOf("\\",index);                        //2   (indexOf�Ǵ��ƶ������λ�ÿ�ʼ�����ģ����λ�øպþ�����)
		System.out.println(index);

		String sub = path.substring(index);                      //ȥ���������������λ��ǰ�����С�
		System.out.println(sub);                                 //\book\javabook\Java Programmer.doc         

		index = path.lastIndexOf("\\");
		System.out.println(index);                               //16

		sub = path.substring(index + 1);                         
		System.out.println(sub);                                 //Java Programmer.doc
		System.out.println(sub.contains("Programmer"));          //True
	} 
}

