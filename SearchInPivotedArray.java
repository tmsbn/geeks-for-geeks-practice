public class SearchInPivotedArray{

	public static void main(String args[]){

		int arr[] = {14, 15, 16, 1, 2, 3, 6 ,7 , 8};

		int mid = 0;
		int low = 0;
		int high = arr.length - 1;

		int search = 16;

		boolean found = false;	

		while(low <= high && !found){

			System.out.println("Low and high:" + low + "," + high);

			mid = (low + high) / 2;
			if(search > arr[mid]){
				if(search < arr[high])
					low = mid + 1;
				else{
					if(arr[mid] < arr[high]){
						high = mid - 1;
					}else{
						low = mid + 1;
					}
				}
			}else if(search < arr[mid]){
				if(search > arr[low])
					high = mid - 1;
				else{
					if(arr[mid] > arr[low]){
						high = mid - 1; 
					}else{
						low = mid + 1;
					}
				}
			}else{
				found = true;
			}

		}

		if(found){
			System.out.println("Array was found at " + mid);
		}else{
			System.out.println("Element was not found");
		}


	}
}