public class regular {
    public static void main(String[] args) {
        int n=101;
        String str="12/05/2003";
        // boolean isbinary =str.matches("[01]*");
        System.out.println(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        String str2="a!Bc@#1$2%32abc";

        String str4=str2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str4);
        
        String str6="   hey hello  janardhan abc";
        String s1=str6.replaceAll("\\s+",""); // OR 
        System.out.println(s1);

    }
}
