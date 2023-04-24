class XiyoujiRenwu {
	float height;
	float weight;
	String head;
	String ear;
	String hand;
	String foot;
	String mouth;
	void speak(String s) {
		head = "歪着头";
		System.out.println(s);
	}
}

public class Example5_3 {
	public static void main(String args[]) {
		XiyoujiRenwu zhubajie = new XiyoujiRenwu();     //创建对象 猪八戒、孙悟空
		XiyoujiRenwu sunwukong = new XiyoujiRenwu();

		zhubajie.height = 1.80f;                        //为对象自己的变量赋值
		zhubajie.head = "大头";
		zhubajie.ear = "一双大耳朵";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "秀发飘飘";

		System.out.println("猪八戒的身高：" + zhubajie.height);
		System.out.println("猪八戒的头：" +  zhubajie.head);
		System.out.println("孙悟空的体重：" + sunwukong.weight);
		System.out.println("孙悟空的头：" + sunwukong.head);
		zhubajie.speak("俺老猪想取媳妇");                        //对象调用方法
		System.out.println("猪八戒现在的头：" + zhubajie.head);
	}
}