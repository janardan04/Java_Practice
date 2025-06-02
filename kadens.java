import java.util.*;
public class kadens {
    public static int maxSubarraySum(int[] arr) {
        // Your code here
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int []arr= new int[size]; 
        System.out.println("enter the elements of array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("arrays are");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        int sum = maxSubarraySum(arr);
        System.out.println(sum);
        
    }
}
