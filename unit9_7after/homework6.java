class homework6{
	public static void main(String args[]){
		String s1 = "ABCabc12";
		String s2 = "���";
		System.out.println(s1.toUpperCase());  //ABCABC12
		System.out.println(s1.toLowerCase());  //abcabc12
		System.out.println(s1.concat(s2));     //ABCabc12���
		// string.toUpperCase() ���д
		// string.toLowerCase() ��Сд
		// string.concat(string_) ƴ��
	}
}