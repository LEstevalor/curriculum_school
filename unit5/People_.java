public class People_ {
	int leg,hand;
	String name;
	People_(String s){  //�ڹ��췽����ʹ��this
		name = s;
		this.init();   //�˴�this�ɲ���
	}
	void init(){
		leg = 2;
		hand = 2;
		System.out.println(name + "��" + hand + "ֻ��" + leg + "����");
	}
	public static void main(String args[]) {
		People_ boshi = new People_("��ʲ");   //����boshiʱ�����췽���е�this���Ƕ���boshi
	}
}

