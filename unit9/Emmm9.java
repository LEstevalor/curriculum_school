public class Emmm9{
	public static void main(String args[]){

		StringBuffer buffer2 = new StringBuffer();
		System.out.println(buffer2.length());    //0
		System.out.println(buffer2.capacity());  //(��ʼ����=)16  

		StringBuffer buffer3 = new StringBuffer(4);
		System.out.println(buffer3.length());    //0
		System.out.println(buffer3.capacity());  //(ָ��int����)4

		StringBuffer buffer1 = new StringBuffer("I am a ����");
		System.out.println(buffer1.length());    //9
		System.out.println(buffer1.capacity());  //(9+16=)25     (s+16)

		//���ϼ�Ϊ3��StringBuffer�Ĺ��췽���� StringBuffer()  StringBuffer(int size)  StringBuffer(String s) �������ڳ�������ʱ�����Զ��ؿ�
	}
}


