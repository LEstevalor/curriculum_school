public class Em9_4{
	public static void main(String args[]){   //����args�ܽ����û��Ӽ���������ַ�������java.exeִ�����ࣩ
		double average = 0;
		double sum = 0;
		double item = 0;
		boolean computable = true;
		for(String s:args){
			if(s.equals(String.valueOf(Integer.parseInt(s)))){    //�����true��s == String.valueOf(Integer.parseInt(s))Ϊʲô���У�����
				System.out.println("����");                       //���������
			}
			try{
				item = Double.parseDouble(s);    //Integer.parseInt() �������ַ�������
				sum += item;
			}
			catch(NumberFormatException e){
				System.out.println("����Ƿ������ַ�" + e);
				computable = false;
			}
		}
		if(computable){                                     //����Ӧ��String.valueOf �����ԣ���Ϊ�ַ���
			System.out.println("sum = " + sum);             //���⻹��Byte.parseByte ,Short.parseShort �ȵȵ�
		}
	}
}