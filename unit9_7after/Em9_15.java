import java.util.*;
import static java.util.Calendar.*;
public class Em9_15{
	public static void main(String args[]){
		Calendar calendar = Calendar.getInstance();    //Calendar���static����getInstance()���Գ�ʼ��һ����������
	//	Calendar calendar = new Calendar();   //����Calendar�ǳ����; �޷�ʵ����
		calendar.setTime(new Date());         //Calendar�������setTime()���������������ڵ�ʱ�䣨new Date()��
		String �� = String.valueOf(calendar.get(YEAR)),
			   �� = String.valueOf(calendar.get(MONTH) + 1),         //0��ʾ1�£��Դ����ơ�    
			   �� = String.valueOf(calendar.get(DAY_OF_MONTH));      //calendar����ĵ��÷�����calendar.get(YEAR/MONTH/DAY_OF_MONTH/DAY_OF_WEEK
	    int hour = calendar.get(HOUR_OF_DAY),                                                            //    /HOUR_OF_DAY/MINUTE/SECOND)
	        minute = calendar.get(MINUTE),                           //DAY_OF_WEEK 1�����գ�2����һ������
	        second = calendar.get(SECOND);
	    System.out.print("The now time is: ");
	    System.out.print(�� + "��" + �� + "��" + �� + "��");
	    System.out.println(" " + hour + "ʱ" + minute + "��" + second + "��");
	    int year = 1949,
	        month = 9,
	        day = 1;
	    calendar.set(year,month - 1,day);
	    System.out.println(calendar.get(MONTH)); 
	    long time1 = calendar.getTimeInMillis();     //calendar.getTimeInMillis() �õ�����1970.1.1.08��calendarʱ�ĺ�����
	    calendar.set(year + 60,month - 1,day);
	    long time2 = calendar.getTimeInMillis();
	    long ������� = (time2 - time1)/(1000 * 60 * 60 *24);    //����-��-��-ʱ-��
	    System.out.println("2009.10.1��1949.10.1���������" + ������� + "��");
	    calendar.set(1970,0,1);
	    System.out.println(calendar.getTimeInMillis()/(8 * 60 * 60 * 1000));  //0
	}
}
        //����ɾ��
	    // year = 2009;
	    // month = 9;
	    // day = 1;