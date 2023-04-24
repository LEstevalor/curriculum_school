public class Em9_3{
	public static void main(String args[]){
		String path = "c:\\book\\javabook\\Java Programmer.doc";
		System.out.println(path);                                //c:\book\javabook\Java Programmer.doc(真正算入的也只有这个)

		int index = path.indexOf("\\");
		System.out.println(index);                               //2
		
		index = path.indexOf("\\",index);                        //2   (indexOf是从制定的这个位置开始检索的，这个位置刚好就满足)
		System.out.println(index);

		String sub = path.substring(index);                      //去掉包括声明的这个位置前的所有。
		System.out.println(sub);                                 //\book\javabook\Java Programmer.doc         

		index = path.lastIndexOf("\\");
		System.out.println(index);                               //16

		sub = path.substring(index + 1);                         
		System.out.println(sub);                                 //Java Programmer.doc
		System.out.println(sub.contains("Programmer"));          //True
	} 
}

