public class Em9_7{
	public static void main(String args[]){
		byte d[] = "java你好".getBytes();
		// getBytes返回一字节数组，（GB2312），返回的为编码，一个字母编码占一个单元，一个文字占两个单元。
		// d[0] d[1] d[2] d[3] 分别为 j a v a
		// d[4] d[5] 你，d[6] d[7] 好

		System.out.println("数组d长度：" + d.length);   //字符数组的话直接length，字符串对象的话对应length()方法
		String s = new String(d,6,2);
		System.out.println(s);
		s = new String(d,0,6);
		System.out.println(s);
	}
}