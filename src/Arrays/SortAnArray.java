package Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int [] arr= {53,676,4,5,7,1,5,88,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
