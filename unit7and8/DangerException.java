class DangerException extends Exception{
	String message;
	public DangerException(){
		message = "Σ��Ʒ";
	}
	public void toShow(){
		System.out.println(message + " ");
	}
}