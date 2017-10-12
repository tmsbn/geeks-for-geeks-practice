public class SubArraySum{


	public String method1(int arr[], int targetSum){

		int sum = 0;
		for(int i = 0; i < arr.length; i++){

			sum = arr[i];
			for(int j = i + 1; j < arr.length; j++){
				sum += arr[j];
				if(sum > targetSum){
					break;
				}else if(sum == targetSum){
					return "The indices are " + i +" and " + j;
				}
			}
		}
		return "No such sub array found";
	}

	public String method2(int arr[], int targetSum){

		int sum = 0;
		int left = 0, right = 0;

		while(left < arr.length){

			if(sum < targetSum && right < arr.length)
				sum += arr[right++];
			else if(sum > targetSum && left < arr.length)
				sum -= arr[left++];
			else
				return "The indices are " + left + " and " + --right;
		}

		return "No such sub array found";
	}
	
	public static void main(String[] args){

		int arr[] = {3, 4, 1, 5, 6, 7, 2};
		SubArraySum subArraySum = new SubArraySum();

		int targetSum = 20;
		System.out.println(subArraySum.method1(arr, targetSum));
		System.out.println(subArraySum.method2(arr, targetSum));
	}
}