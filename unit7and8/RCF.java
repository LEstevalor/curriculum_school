public class RCF{                //�����ڲ�����ࡪ����Ƕ��
	String formName;
	RedCow cow;                  //�ڲ�����������
	RCF(){
	}
	RCF(String s){
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess(){
		cow.speak();
	}
	class RedCow{               //�ڲ��������
		String cowName = "��ţ";    //ע���ڲ��಻��������������෽�����ҽ���������Ƕ��ʹ�á�
		int h,w,p;
		RedCow(int h,int w,int p){
			this.h = h;
			this.w = w;
			this.p = p;
		}
		void speak(){
			System.out.println("��" + cowName + "��" + h);
		}
	}
}

