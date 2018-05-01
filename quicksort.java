public static void quicksort(int[] nums,int low,int high){
	if(low>=high) return;
	int i = low;
	int j = high;
	int pivot = nums[high];
	while(i<j){
		if(nums[i++]>pivot) swap(nums,--i,--j);
	}
	swap(nums,i,high);
	quicksort(nums,low,i-1);
	quicksort(nums,i+1,high);
}

public static void swap(int[] nums, int i, int j){
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}
