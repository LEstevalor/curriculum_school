import java.util.*;
class homework8{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("plaese input year:");
		int year = scanner.nextInt();
		System.out.print("plaese input month:");
		int month = scanner.nextInt();
		char []str = "日一二三四五六".toCharArray();
		for(char c:str){
			System.out.printf(" %3c",c);
		}
		CalendarBean cb = new CalendarBean();
		cb.setYear(year);
		cb.setMonth(month);
		String []a = cb.getCalendar();
		for(int i = 0;i < a.length;i++){
			if(i % 7 == 0){
				System.out.printf("\n");
			}
			System.out.printf("%5s",a[i]);
		}
	}
}