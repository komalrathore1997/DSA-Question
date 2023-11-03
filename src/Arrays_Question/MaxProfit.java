package Arrays_Question;

public class MaxProfit {
    public static void main(String[] args) {
    	int []prices = {7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
        }
        
        for(int i=0;i<prices.length;i++){
            if(min==prices[i]){
                int j=i+1;
                while(j<prices.length){
                    max=Math.max(max,prices[j]);
                    j++;
                }
            }

        }
        System.out.println( max-min);
	}
}
