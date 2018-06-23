public class JavaLessonSeventeen {
	
	public static void main(String[] args) {
		
//		Thread getTime = new GetTime20();
		
		Runnable getMail = new GetTheMail(1);
		
//		Runnable getMailAgain = new GetTheMail(5);
		
		new Thread(getMail).start();
//		new Thread(getMailAgain).start();
		
//		getTime.start();
	}
}