package Numbers;

public class Binary {
	public static void main(String args[])
    {
               int r=0,c=0,num=100012,b;
         
         
          b= num;
          while(num!=0)
               {
                  if((num %10==0)|| (num%10==1))
                     c++;
                     r++;
                     num=num/10;
               }
                  if(c==r)
           System.out.println(b+" is a Binary Number.");
           else
           System.out.println(b+" is not a Binary Number");
       }
}
