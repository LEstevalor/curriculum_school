class XiyoujiRenwu {
	float height;
	float weight;
	String head;
	String ear;
	String hand;
	String foot;
	String mouth;
	void speak(String s) {
		head = "����ͷ";
		System.out.println(s);
	}
}

public class Example5_3 {
	public static void main(String args[]) {
		XiyoujiRenwu zhubajie = new XiyoujiRenwu();     //�������� ��˽䡢�����
		XiyoujiRenwu sunwukong = new XiyoujiRenwu();

		zhubajie.height = 1.80f;                        //Ϊ�����Լ��ı�����ֵ
		zhubajie.head = "��ͷ";
		zhubajie.ear = "һ˫�����";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "�㷢ƮƮ";

		System.out.println("��˽����ߣ�" + zhubajie.height);
		System.out.println("��˽��ͷ��" +  zhubajie.head);
		System.out.println("����յ����أ�" + sunwukong.weight);
		System.out.println("����յ�ͷ��" + sunwukong.head);
		zhubajie.speak("��������ȡϱ��");                        //������÷���
		System.out.println("��˽����ڵ�ͷ��" + zhubajie.head);
	}
}