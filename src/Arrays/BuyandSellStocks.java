package Arrays;

public class BuyandSellStocks {

	public static void main(String[] args) {
		int[] arr = { -5, 1, 0 , 5, -3};

		int maxprofit = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++)
				if (arr[j] > arr[i]) {

					maxprofit = arr[j];
					break;
				}

		}

		System.out.println(maxprofit);
	}

}
