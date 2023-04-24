class homework6{
	public static void main(String args[]){
		String s1 = "ABCabc12";
		String s2 = "额阿达";
		System.out.println(s1.toUpperCase());  //ABCABC12
		System.out.println(s1.toLowerCase());  //abcabc12
		System.out.println(s1.concat(s2));     //ABCabc12额阿达
		// string.toUpperCase() 变大写
		// string.toLowerCase() 变小写
		// string.concat(string_) 拼接
	}
}