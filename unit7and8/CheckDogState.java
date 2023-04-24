interface Dogstate{
	public void showState();
}
class SoftlyState implements Dogstate{
	public void showState(){
		System.out.println("��������ǰ������������");
	}
}
class MeetEnemyState implements Dogstate{
	public void showState(){
		System.out.println("�������˿�У���ҧ��");
	}
}
class MeetFriendState implements Dogstate{
	public void showState(){
		System.out.println("�������ѣ���ӭ");
	}
}
class Dog{
	Dogstate state;
	public void cry(){
		state.showState();
	}
	public void setState(Dogstate s){
		state = s;
	}
}
public class CheckDogState{
	public static void main(String args[]){
		Dog yellowDog = new Dog();
		yellowDog.setState(new SoftlyState());
		yellowDog.cry();
		yellowDog.setState(new MeetEnemyState());
		yellowDog.cry();
		yellowDog.setState(new MeetFriendState());
		yellowDog.cry();
	}
}