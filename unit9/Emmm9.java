public class Emmm9{
	public static void main(String args[]){

		StringBuffer buffer2 = new StringBuffer();
		System.out.println(buffer2.length());    //0
		System.out.println(buffer2.capacity());  //(初始容量=)16  

		StringBuffer buffer3 = new StringBuffer(4);
		System.out.println(buffer3.length());    //0
		System.out.println(buffer3.capacity());  //(指定int长度)4

		StringBuffer buffer1 = new StringBuffer("I am a 好人");
		System.out.println(buffer1.length());    //9
		System.out.println(buffer1.capacity());  //(9+16=)25     (s+16)

		//以上即为3种StringBuffer的构造方法： StringBuffer()  StringBuffer(int size)  StringBuffer(String s) ——大于长度容量时都会自动拓宽
	}
}


