package Arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};  
        int key = 100;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

	}

}
