public class Amazing9{
	public static void main(String args[]){
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.append("what`uu"));
		buffer.setCharAt(6,'p');                      
		//System.out.println(buffer.setCharAt(6,'p'));������ʾ����Ϊ�գ��������ص�ǰ��������ã� ������ ע��
		System.out.println(buffer);                   //what`up     // buffer.setCharAt(int,char) nλ�û�Ϊ�ַ�c(ע�����ַ���'')  
		System.out.println(buffer.charAt(4));         //`           // buffer.charAt(int)    ��ȡnλ�õ��ַ�

//		buffer.insert(6,"!");       //what`u!p��ռ�˵�6λ�õ�p��
		System.out.println(buffer.insert(7,"!")); //what`up!        // buffer.insert(int,String)  nλ�ô������ַ���String  �ҷ��ص�ǰ���������

		System.out.println(buffer.reverse());	  //!pu`tahw        // buffer.reverse()  ��ת  �ҷ��ص�ǰ���������

		System.out.println(buffer.delete(0,3));   //`tahw           // buffer.delete(int start,int end) ɾ���ַ�����start��end-1λ�õ����ַ���
		                                                            //  ���ҷ��ص�ǰ��������á�
		System.out.println(buffer.replace(0,1,"what "));//what tahw // buffer.replace(int start,int end,String) ��s�滻start��end-1λ�õ��ַ��� 
	}
}

