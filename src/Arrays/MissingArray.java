package Arrays;

import java.util.Arrays;

public class MissingArray {
public static void main(String[] args) {
	int [] arr = {10,20,40,67,78};
	int sum =0;
	int [] arr1= {10,20,40,78};
	int sum1= 0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	
	for(int j=0;j<arr1.length;j++) {
		sum1=sum1+arr1[j];
	}
	
	System.out.println(sum-sum1);
	//System.out.println(sum1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
