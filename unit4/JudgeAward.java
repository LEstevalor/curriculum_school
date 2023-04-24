// example4.2

public class JudgeAward {
	void giveMess(int number) {
		switch(number) {
			case 9 :
			case 131 :
			case 12 : System.out.println(number + "是三等奖");
					  break;
			case 209 :
			case 596 :
			case 27 : System.out.println(number + "是二等奖");
					  break;
			case 875 :
			case 316 :
			case 59 : System.out.println(number + "是一等奖");
					  break;
		    default :  System.out.println(number + "未中奖");
		}
	}
}