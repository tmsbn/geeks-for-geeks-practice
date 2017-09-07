public class SearchInPivotedArray{

	public static void main(String args[]){

		int arr[] = {14, 15, 16, 1, 2, 3, 6 ,7 , 8};

		int mid = 0;
		int low = 0;
		int high = arr.length - 1;

		int search = 17;

		boolean found = false;	


		while(low <= high && !found){

			mid = (low + high) / 2;
			if(search > arr[mid]){

				// if arr[mid] < search < arr[high], then search elmt must be in the right side of mid
				if(search < arr[high])
					low = mid + 1;
				else{
					// The search elmt may be the right or left side of mid
					if(arr[mid] < arr[high]){
						high = mid - 1;
					}else{
						low = mid + 1;
					}
				}
			}else if(search < arr[mid]){

				// if arr[low] < search < arr[mid], then search elmt must be in the left side of mid
				if(search > arr[low])
					high = mid - 1;
				else{

					// The search elmt may be the right or left side of mid
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