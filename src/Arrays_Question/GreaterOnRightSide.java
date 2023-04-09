package Arrays_Question;

public class GreaterOnRightSide {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };
		int temp[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(i==a.length) {
				temp[temp.length]=-1;
			}
			int max = a[i+1];
			for (int j = i+1; j < a.length; j++) {
				if (max < a[j]) {
                     max=a[j];
				}
				
			}
			temp[i]=max;
		}
		System.out.println(temp);
	}
}
