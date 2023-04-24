public class Hello{
	public static void main(String args[]){
		System.out.println("你好，很高兴学习Java");
		Student zhang = new Student();
		zhang.speak();
	}
}
class Student{
	void speak(){
		System.out.println("We are students");
	}
}