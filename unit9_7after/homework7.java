class homework7{
	public static void main(String args[]){
		String string = "打大声说架";
		char []c = string.toCharArray();     //针对的是字符数组
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(string.length()-1));  //要注意越界问题
	}                                                          //string.length()长度-1才是位置
}



