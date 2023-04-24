import java.util.*;
public class Em9_2{
	public static void main(String args[]){
		String []a = {"melon", "apple", "pear", "banana"};
		String []b = Arrays.copyOf(a,a.length);
		System.out.println("使用自定义的SoftString类，按字典顺序排列数组a:");
		SoftString.sort(a);
		System.out.println("排列顺序是:");
		for(String s:b){
			System.out.print(" " + s);
		}
		System.out.println("");
		System.out.println("使用类库中的Arrays类，按字典序列排序数组b：");
		Arrays.sort(b);
		System.out.println("排列顺序是:");
		for(String s:b){
			System.out.print(" " + s);
		}
	}
}