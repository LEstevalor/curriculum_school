import java.util.Date;
import java.text.SimpleDateFormat;   //ע���������
public class Date9{
	public static void main(String args[]){
		Date nowTime = new Date();                                       //Date���޲������췽������������ʱ��
		System.out.println("���ڹ���ʱ����" + nowTime);    // ���ڹ���ʱ����Tue Oct 19 16:34:09 CST 2021

		System.out.println(System.currentTimeMillis());	 //��1970��1��1��08ʱ�������߹��ĺ����� // 1634632449335
                                                         //System.currentTimeMillis()��
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat SDF = new SimpleDateFormat(pattern);    //SimpleDateFormat(String pattern) ���� ���õĹ��췽��
		String timePattern = SDF.format(nowTime);                // format(Date data)���� ���� ��ʽ��
		System.out.println(timePattern);                // 2021-10-19

		pattern = "G yyyy��MMMd��E hhʱmm��ss��z";
		SDF = new SimpleDateFormat(pattern);
		timePattern = SDF.format(nowTime);
		System.out.println(timePattern);                // ��Ԫ 2021��10��19���ܶ� 04ʱ34��09��CST
	}
}

