public class MainClass {
	public static void main(String args[]) {
		Village zhaoZhuang,maJiaHeZhi;
		zhaoZhuang = new Village("��ׯ");
		maJiaHeZhi = new Village("��Һ���");
		zhaoZhuang.peopleNumber = 100;
		maJiaHeZhi.peopleNumber = 150;
		Village.treeAmount = 200;            //���������
		int leftTree = Village.treeAmount;
		System.out.println("ɭ������" + leftTree + "����");
		zhaoZhuang.treePlanting(50);         //�������ʵ������
//		Village.treePlanting(50);            // ��  �޷��Ӿ�̬�����������÷Ǿ�̬ ���� �� 
		leftTree = maJiaHeZhi.lookTreeAmount(); //��������෽������̬������
		System.out.println("ɭ������" + leftTree + "����");
		maJiaHeZhi.fellTree(70);
		leftTree = Village.lookTreeAmount();    //�����������෽������̬������
		System.out.println("ɭ������" + leftTree + "����");
		System.out.println("��ׯ���˿ڣ�" + zhaoZhuang.peopleNumber);
		zhaoZhuang.addPeopleNumber(12);
		System.out.println("��ׯ���˿ڣ�" + zhaoZhuang.peopleNumber);
	}
}