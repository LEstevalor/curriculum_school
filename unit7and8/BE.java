public class BE extends Exception{
	String message;
	public BE(int m,int n){
		message = "不符合系统要求";
	}
	public String warnMess(){
		return message;
	}
}