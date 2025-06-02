class Reverse{
    public static void main(String[] args) {
      int  a[]={1,2,3,4,5,6,7,8};
      int n=7;
      for(int i=0;i<=n/2;i++){
        int temp=a[i];
        a[i]=a[n-i];
        a[n-i]=temp;
      }
      for(int i=0;i<=n;i++){
System.out.println(a[i]);
      }
    }
}