public class E8_2{
	public static void main(String args[]){
		SB board = new SB();
		board.showMess(new IE());                //向参数传递IA的子类对象
		board.showMess(new IA(){                 //向参数传递IA的匿名子类对象
			public void input(){
				for(char c = 'A'; c <= 'C'; c++){
					System.out.printf("%3c",c);
				}
			}
		}
		);
	}
}

