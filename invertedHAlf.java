

public class invertedHAlf {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("another way for the half inverted pyramid is :");
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //half pyramid 180 degree rotated
        for(int i = 0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //printing the numbers // replace * with numbers
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("inverted half pyramid pattern ");
         //inverted half pyramid pattern the numbers // replace * with numbers
         for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            if(i!=n-1){
            System.out.println();
            }
        }
    }
}
