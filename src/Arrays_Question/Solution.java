package Arrays_Question;

import java.util.Scanner;

public class Solution {
    public static void main(String args[] )  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       Solution solution = new Solution(); 
       System.out.println("output");
       Scanner scan=new Scanner(System.in);
       Integer[] arr = new Integer[99];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        Integer total= solution.sum(arr);
        System.out.println(total);
    }
    
    public Integer sum(Integer[] ints){
        int total=0;
        for(int i=0;i<ints.length;i++){
            total=total+ints[i];
        }
        return total;
        
    }
    
    
}