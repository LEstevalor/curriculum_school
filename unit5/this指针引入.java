public class thisָ������ {
	public static void main(String args[]) {
		Temp1 yy1 = new Temp1();
		Temp2 yy2 = new Temp2();
		yy1.f();
		yy2.g();
	}
}

class Temp1 {
	int x = 100;
	int y1;
	void f() {         //����һ���պ���
		int x = 1;     //�ֲ�����������ͬ���ĳ�Ա������
		y1 = x + x;
		System.out.println("�ֲ����ؽ��" + y1);
	}
}

class Temp2 {
	int x = 100;
	int y2;
	void g() {
		int x = 1;
		y2 = this.x + this.x;       //this.x������Ǳ����صĳ�Ա����
		System.out.println("��thisָ����" + y2);
	}
}

