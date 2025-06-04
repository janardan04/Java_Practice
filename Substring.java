public class Substring {
    public static void main(String[] args) {
        String str="janardan@gmail.com";
        int l=str.length();
        int n=str.indexOf("@");
        String str2=str.substring(n+1, l);
        String str3=str.substring(0,n);

        if(str2.equals("gmail.com")){
            System.out.println("Domain is "+str2);
        }
        else{
            System.out.println(str2.startsWith("gmail"));
        }
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str2.startsWith("gmail"));
    }
}
