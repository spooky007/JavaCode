public class GetTheMail implements Runnable {
	
	private int startTime;
	
	public GetTheMail(int startTime) {
		this.startTime = startTime;
	}
	
	public void run() {
		for (int i = 0; i <= 4; i++) {
			
			try {
				Thread.sleep(startTime * 1000);
			} catch(InterruptedException e) {
				
			}
			System.out.println("Checking Mail");
		}
	} 
}