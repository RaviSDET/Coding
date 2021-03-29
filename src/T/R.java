package T;

public class R {
	
	static int a=10;
	static int b=20;
	
	public  void m1(int a, int b){
		this.a=a;
		this.b=b;
	}
	
		{
			System.out.println("B");
		}
		R()
		{
			System.out.println("A");
		}
		{
			System.out.println("C");
		}
		static{
			System.out.println("XYZ");
		}

	
	public static void main(String[] args) {
		R r = new R();
		System.out.println(a+" "+b);
      
	}

}
