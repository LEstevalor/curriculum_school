import java.util.Scanner;
public class Em9_8{
	public static void main(String args[]){
		String sourceString = "����ʮ�����";
		EncryptAndDecrypt person = new EncryptAndDecrypt();
		System.out.println("����������ܣ�" + sourceString);
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		String secret = person.encrypt(sourceString,password);
		System.out.println("���ģ�" + secret);
		System.out.println("�����������");
		password = scanner.nextLine();
		String source = person.decrypt(secret,password);
		System.out.println("���ģ�" + secret);
	}
}