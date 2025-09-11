
import java.util.*;

public class merse2sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of 1 st array :");
        int n1 = sc.nextInt();
        System.out.println("enter the size of 2 nd array :");
        int n2 = sc.nextInt();

        int arr[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("enter the sorted elements of 1st array :");
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the sorted elements of 2nd array :");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < n2; i++) {
            System.out.println(arr2[i]);
        }
        int arr3[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr[i] < arr2[j]) {
                arr3[k] = arr[i];
                k++;
                i++;
            } else if (arr[i] > arr2[j]) {
                arr3[k] = arr2[j];
                k++;
                j++;
            } else if (arr[i] == arr2[j]) {
                arr3[k] = arr[i];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr3[k]=arr[i];
            k++;
            i++;
        }
        
        while(j<n2){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        System.out.println("sorted and merge :");
        for(int l=0;l<arr3.length;l++){
            System.out.println(arr3[l]);
        }
    }
}
