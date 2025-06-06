//It is only for sorted array
import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the k :");
        int k=sc.nextInt();
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]+arr[j]==k){
                System.out.println(arr[i]+" + "+arr[j]+" = "+k);
                j--;
                i++;
            }
            else if(arr[i]+arr[j]>k){
                j--;
            }
            else{
                i++;
            }
        }

    }
}
