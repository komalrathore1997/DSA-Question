package Arrays_Question;

public class maxIndexDiff {
	public static void main(String[] args) {
		int arr[]= {34 ,8 ,10 ,3 ,2 ,80 ,30 ,33 ,1};
		int n=arr.length;
		int max = 0;
		int length = 0;
		int k=0;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (arr[i] <= arr[j]) {
					k=i;
					length = j;
					break;
				}
			}
			max = Math.max(max, length);
		}
		System.out.println(max-k); 
	}
}
