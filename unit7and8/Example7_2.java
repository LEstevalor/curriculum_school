interface ShowMessage {          //�ӿ�
	void ��ʾ�̱�(String s);      //public ���󷽷�
	void name();
}

class Abab{
	public void haha(ShowMessage a){  //�ӿ����Ͳ���
		a.name();                     //�ӿڻص�
	}                                           //��������ķ����Ĳ����ĺܷ�
}


class TV implements ShowMessage{
	public void ��ʾ�̱�(String s){   //ע�������public����©�����ܼ��ͷ���Ȩ�ޣ�
		System.out.println(s);         
	}
	public void name(){
		System.out.println("TV");
	}
}

class PC implements ShowMessage{
	public void ��ʾ�̱�(String s){
		System.out.println(s);         
	}
	public void name(){
		System.out.println("PC");
	}
}

public class Example7_2{
	public static void main(String args[]){
		ShowMessage sm;                //˵���ӿڱ���
		sm = new TV();                 //�ӿڱ����д�Ŷ�������ã��ӿڵ����ʵ�������ã�
		sm.��ʾ�̱�("�����Ƶ��ӻ�");     //�ӿڻص�
		sm = new PC();
		sm.��ʾ�̱�("����");            //�ӿڻص��ķ������������ǲ����ϼ򵥣����ҿ��ܻ������ڴ桢�����ٶ��йأ��Ҳµģ�

		Abab abab = new Abab();
		abab.haha(new TV());           //���� ���� �ӿڵ����ʵ��������
		TV ab = new TV();
		ab.��ʾ�̱�("�����Ƶ��ӻ�");

	}
}

