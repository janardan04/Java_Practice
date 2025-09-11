



public class Lec29Practice {
    public static void main(String[] args) {
        // float [] marks={45.1f,42.3f,48.4f};
        // float sum= 0;
        // for(float element :marks){
        //     sum = sum+element;

        // }
        // System.out.printf("%0.2f",sum);
        // practice problem 2
        // float [] marks={45.1f,42.3f,48.4f};
        // float sum= 45.8f;
        // boolean isInArray=false;
        // for(float element :marks){
        //     if(sum==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("the num is in array !!");

        // }
        // else{
        //     System.out.println("number is in not in array");
        // }
        //practice3
        // float [] marks={45.1f,42.3f,48.4f};
        // float sum= 0;
        // for(float element :marks){
        //     sum = sum+element;

        // }
        // System.out.printf("%.2f",sum/marks.length);

        // problem 4
        // int [][] m1={{1,2,3},{4,5,6},{7,8,9}};
        // int [][] m2={{7,8,9},{1,2,3},{4,5,6}};
        // int [][] res={{0,0,0},{0,0,0},{0,0,0}};

        // for(int i=0;i<m1.length;i++){
        //     for(int j=0;j<m1[i].length;j++){
        //         res[i][j]=m1[i][j] + m2[i][j];
        //     }
        // }
        // for(int i=0;i<m1.length;i++){
        //     for(int j=0;j<m1[i].length;j++){
        //         System.out.print(res[i][j]);
        //         System.out.print("  ");
        //     }
        //     System.out.println("");
        //     }

        //problem 5
        // int [] arr={1,2,3,4,5,6,7,8,9};
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]);
        //     System.out.print(" ");
        // }
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
      for(int k=1;k<=n;k++){
        for(int h=1;h<=k;h++){
            System.out.print("* ");
        }System.out.println("");
      }
      System.out.println("");
      for(int y=1;y<=n;y++){
        for(int s=1;s<=(n-y);s++){
            System.out.print("  ");
        }
        for(int r=1;r<=(2*y-1);r++){
            System.out.print("* ");
        }
        System.out.println("");
      }
        }
}
