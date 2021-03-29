package Numbers;

public class HCF {

	 
	      
	    // Driver method 
	    public static void main(String[] args)  
	    { 
	        int x = 2, y = 6; 
	        
	        int a = x;
	       int  b = y;
	        
	       while (b!=0) {
	    	   int temp = b;
	    	   b=a%b;
	    	   a=temp;
	       }
	       int hcf=a;
	       int lcm=(x*y)/hcf;
	       System.out.println(hcf);
	       System.out.println(lcm);
	    } 

}
