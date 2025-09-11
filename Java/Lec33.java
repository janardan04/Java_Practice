public class Lec33 {
      static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
      }
      public static void main(String[] args) {
        int b=sum();
        System.out.println(b);
      }
}
