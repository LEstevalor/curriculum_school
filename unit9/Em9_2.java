import java.util.*;
public class Em9_2{
	public static void main(String args[]){
		String []a = {"melon", "apple", "pear", "banana"};
		String []b = Arrays.copyOf(a,a.length);
		System.out.println("ʹ���Զ����SoftString�࣬���ֵ�˳����������a:");
		SoftString.sort(a);
		System.out.println("����˳����:");
		for(String s:b){
			System.out.print(" " + s);
		}
		System.out.println("");
		System.out.println("ʹ������е�Arrays�࣬���ֵ�������������b��");
		Arrays.sort(b);
		System.out.println("����˳����:");
		for(String s:b){
			System.out.print(" " + s);
		}
	}
}