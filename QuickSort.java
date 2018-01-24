package algorithms;

public class QuickSort {
	int partition (int arr[], int low, int high)
	{
		int pivot = arr[high]; //setting the pivot as the last element
		int i = (low -1); //index of smaller element
		
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot)
			{
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//swap arr[i+1] and arr[high] - the pivot
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}