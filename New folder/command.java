class command{
public static void main(String []args){
Double sum=0.0;
for(int i=0;i<args.length;i++){
sum+=Double.parseDouble(args[i]);
}
System.out.println(sum);
}}