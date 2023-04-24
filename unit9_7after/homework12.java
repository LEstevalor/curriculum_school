import java.util.*;  //注意：这里不能只是导入Scanner类，由于也用到InputMismatchException类，所以最好直接导入整个包
class homework12{
	public static void main(String args[]){
		String string = "数学87分，物理76分，英语96分";
		Scanner scanner = new Scanner(string);
		scanner.useDelimiter("[^0123456789]+");  //匹配非数字部分
		double sum = 0;    //总分
		double number = 0; //科目数
		double average = 0;//平均分
		while(scanner.hasNext()){
			try{
				double temp = scanner.nextInt();
				number += 1;
				sum += temp;
			}
			catch(InputMismatchException exp){
				String temp_ = scanner.next();
			}
		}
		average = sum/number;
		System.out.println("All fraction:" + sum);     
		System.out.println("Average fraction:" + average);
	}
}