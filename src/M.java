
public class M extends B {

	static int y;
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}
	
	public static void main(String[] args) {
		B b = new M();
		
		b.a();  
		b.b();  
		b.c();  
		b.d(); 
	}
	
	public void sayHello() {
		System.out.println("Hello from the other side!");
	}

}
