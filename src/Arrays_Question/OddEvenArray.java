package Arrays_Question;

public class OddEvenArray {
   public static void main(String[] args) {
	int arr[]= {2,1,3,5,6,4,7};
	int k[]=new int[arr.length];
    int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			k[j]=arr[i];
			j++;
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			k[j]=arr[i];
			j++;
		}
	}
	for(int i=0;i<k.length;i++) {
		System.out.println(k[i]);
	}
}
}
