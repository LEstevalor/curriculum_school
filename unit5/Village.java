class Village {                   //�Ѻ���
	static int treeAmount;        //��ľ����(��̬����)���������
	int peopleNumber;             //��ׯ�������Ѻñ�����
	String name;                  //��ׯ����
	Village(String s) {           //���췽��
		name = s;
	}   
	void treePlanting(int n) {    //�Ѻ÷���
		treeAmount += n;
		System.out.println(name + "ֲ��" + n + "��");
	}
	void fellTree(int n) {        //�Ѻ÷���
		if(treeAmount - n >= 0) {
			treeAmount -= n;
			System.out.println(name + "����" + n + "��");
		}
		else{
			System.out.println("�����ɷ�");
		}
	}
	static int lookTreeAmount() {  //�෽������̬������
		return treeAmount;
	}
	void addPeopleNumber(int n) {
		peopleNumber += n;
		System.out.println(name + "������" + n + "��");
	}
}