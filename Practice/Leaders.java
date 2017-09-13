public class Leaders{

	public static void main(String args[]){

		int[] arr = {16, 17, 4, 3, 5, 2};

		int i = arr.length - 1;
		int maxVal = -1;

		while(i >= 0){

			if(arr[i] > maxVal){
				maxVal = arr[i];
				System.out.println(arr[i]);
			}
			i--;
		}
	}
}