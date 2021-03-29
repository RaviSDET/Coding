package Numbers;

public class PrintNumber {
public static void main(String[] args) {
	int num=10;
	for(int i=1;i<=num;i++) {
		//System.out.println(i);
		if(num%i==0) {
			System.out.println(i + "is even number");
		}
	}
}
}
