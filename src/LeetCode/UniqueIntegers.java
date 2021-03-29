package LeetCode;

public class UniqueIntegers {

	public static void main(String[] args) {
	int num=7;
	
	for(int i=1;i<=num/2;i++) {
		System.out.println(i +" "+ -i);
	}
	if(num%2!=0) {
		System.out.println(0);
	}

	}

}
