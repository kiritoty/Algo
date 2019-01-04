
public class BinarySearch {
	public static int BinarySearchIterator(int key, int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while(left <= right) {
			mid = (right - left)/ 2 + left;
			if(arr[mid] > key) {
				right = mid - 1;
			}
			if(arr[mid] < key) {
				left = mid + 1;
			}
			if(arr[mid] == key) {
				return mid;
			}
		}
		
		return -1;
	}
}
