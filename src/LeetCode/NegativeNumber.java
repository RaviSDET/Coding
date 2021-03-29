package LeetCode;

public class NegativeNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 3, -2, -1 };
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0) {
			System.out.println(arr[i]);
			count++;
			}
			
			
			
		}
		System.out.println(count);
		
		
		
		//--------------------------------------------------------------
		
		
		
		int r=10;
		Integer in=new Integer(r);
		System.out.println(in);
		
		Integer p= new Integer(10);
		int d=p;
		System.out.println(d);
		
		
		int a=5;
		int d1=6;
		int n=7;
		System.out.println(a);
		for(int i=1;i<=n;i++) {
			a=a+d1;
			System.out.println(a);
		}
		
		
		
		

	}

}
