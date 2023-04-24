public class Amazing9{
	public static void main(String args[]){
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.append("what`uu"));
		buffer.setCharAt(6,'p');                      
		//System.out.println(buffer.setCharAt(6,'p'));错误，显示类型为空（并不返回当前对象的引用） 《—— 注意
		System.out.println(buffer);                   //what`up     // buffer.setCharAt(int,char) n位置换为字符c(注意是字符，'')  
		System.out.println(buffer.charAt(4));         //`           // buffer.charAt(int)    获取n位置的字符

//		buffer.insert(6,"!");       //what`u!p（占了第6位置的p）
		System.out.println(buffer.insert(7,"!")); //what`up!        // buffer.insert(int,String)  n位置处插入字符串String  且返回当前对象的引用

		System.out.println(buffer.reverse());	  //!pu`tahw        // buffer.reverse()  翻转  且返回当前对象的引用

		System.out.println(buffer.delete(0,3));   //`tahw           // buffer.delete(int start,int end) 删除字符串中start至end-1位置的子字符串
		                                                            //  ↑且返回当前对象的引用↓
		System.out.println(buffer.replace(0,1,"what "));//what tahw // buffer.replace(int start,int end,String) 用s替换start至end-1位置的字符串 
	}
}

