public class variableargs {
    static void show(int ...a){
        for(int i:a){
        System.out.println(i);
        }
    }

    static void showList(int start,String ...s){
        for(int i=0;i<s.length;i++){
        System.out.println(start+"."+s[i]);
        start++;
        }
    }
    static int max(int ...number){
        int max=Integer.MIN_VALUE;
        for(int i:number){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    static int sum(int ...numbers){
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        return sum;
    }
    public static void main(String ...args) {
        show();
        show(1,2,3,4,6,8);
        System.out.println();
        show(new int[]{3,5,6,4,8,9,8,7,41});
        showList(1,"om","suresh","jayesh");
        System.out.println(max(1,2,3,4,10,25,61));
        System.out.println(sum(1,2,3,5));
    }
}
