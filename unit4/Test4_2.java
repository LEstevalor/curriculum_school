public class Test4_2 {
	public static void main(String args[]) {
		char c = '\0';
		for(int i = 1;i <= 4;i++) {
			switch(i) {
				case 1: c = 'ÐÂ';
				         	System.out.print(c);
				case 2: c = 'Ç×';
				            System.out.print(c);
				            break;
				case 3: c = '½ï';
				            System.out.print(c);
				default: System.out.print("!");
			}
		}
	}
}