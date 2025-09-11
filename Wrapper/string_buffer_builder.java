// package Wrapper;

public class string_buffer_builder {
    public static void main(String[] args) {
        String str= new String("hello");

        StringBuffer str1=new StringBuffer("Hello");

        StringBuilder str2=new StringBuilder("Hello");

        str.concat("wolrd");
        str1.append("World");
        str2.append("World");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
