public class E8_2{
	public static void main(String args[]){
		SB board = new SB();
		board.showMess(new IE());                //���������IA���������
		board.showMess(new IA(){                 //���������IA�������������
			public void input(){
				for(char c = 'A'; c <= 'C'; c++){
					System.out.printf("%3c",c);
				}
			}
		}
		);
	}
}

