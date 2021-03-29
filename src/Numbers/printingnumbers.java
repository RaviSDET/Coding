package Numbers;

public class printingnumbers {

	public static void main(String[] args) {
		 int i;
         for(i=1;i<=10;i++)
         {
        	          
                     if(i==5) continue;
                     if(i==6)continue;
                     System.out.println(i +" ");
         }
         
         for(int y=1;y<=10;y++) {
        	 
        	 if(y==5) break;
        	 
        	 System.out.println(y);
        
         }

	}

}
