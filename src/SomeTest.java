import java.util.ArrayList;
import java.util.List;

class SomeTest {
	private final List foo;

	public SomeTest() {
		      foo = new ArrayList();
		      foo.add("foo"); // Modification-1
	}
	
    public static void main(String[] args) {
    		SomeTest t = new SomeTest();
    		t.foo.add("bar"); // Modification-2
    		System.out.println("print - " + t.foo);
    }
    
}

