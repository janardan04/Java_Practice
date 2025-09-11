public class Leetcodeday1 {
    public static void main(String[] args) {
        int n=192;
        int happy=n;
        int flag=0;
        while(flag==0){
            int new1=0;
            happy=n%10;
             n/=10;  
             happy=happy*happy+n*n;
             if(happy==1){
                flag=1;
             }

        }
          
            
        

        // System.out.println(new1);
        System.out.println(happy);
    }
}
