public class Em9_7{
	public static void main(String args[]){
		byte d[] = "java���".getBytes();
		// getBytes����һ�ֽ����飬��GB2312�������ص�Ϊ���룬һ����ĸ����ռһ����Ԫ��һ������ռ������Ԫ��
		// d[0] d[1] d[2] d[3] �ֱ�Ϊ j a v a
		// d[4] d[5] �㣬d[6] d[7] ��

		System.out.println("����d���ȣ�" + d.length);   //�ַ�����Ļ�ֱ��length���ַ�������Ļ���Ӧlength()����
		String s = new String(d,6,2);
		System.out.println(s);
		s = new String(d,0,6);
		System.out.println(s);
	}
}