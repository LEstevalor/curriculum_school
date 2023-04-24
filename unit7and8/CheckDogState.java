interface Dogstate{
	public void showState();
}
class SoftlyState implements Dogstate{
	public void showState(){
		System.out.println("在主人面前，听主人命令");
	}
}
class MeetEnemyState implements Dogstate{
	public void showState(){
		System.out.println("遇到敌人狂叫，并咬人");
	}
}
class MeetFriendState implements Dogstate{
	public void showState(){
		System.out.println("遇到朋友，欢迎");
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