import java.util.Arrays;
public class SoftString{
	public static void sort(String a[]){
		int count = 0;
		for(int i = 0; i < a.length - 1; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[j].compareTo(a[i]) < 0){
				count++;
				System.out.printf("����%s��%s",a[i],a[j]);
				String temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				System.out.println("��" + count + "����������");
				System.out.println(Arrays.toString(a));
				}
			}
		}
	}
}