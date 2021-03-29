package T;

public class KeyWordThis {

	static {
		System.out.println("testing");
		
	}
	
	{
		System.out.println("Hello");
	}
	
	public KeyWordThis() {
		
		
		this(10); 
		System.out.println("constructor");
	}
	
	public KeyWordThis(int x) {
		System.out.println(x);
		
	}
	
	public void test() {
		System.out.println("RTY");
	}
	
	
	public static void main(String[] args) {
		
		KeyWordThis k =new KeyWordThis();
		k.test();
		
	}
	
	
	
	
	
	
	
}
