package Numbers;

public class MultipleOf9 {

	public static void main(String[] args) {
       int num=9;
		int sum = 0;
		int i=1;
		for ( i = 1; i < 100; i++) {
			if (String.valueOf(i).contains("9")) {
				sum = sum + num;
			}
		
		if(String.valueOf(i).contains("99")) {
			sum=sum+num;
		}
		}
		System.out.println(sum);
	}

}
