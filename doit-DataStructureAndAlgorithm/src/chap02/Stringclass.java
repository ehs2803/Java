package chap02;

public class Stringclass {
    public static void main(String [] args){
        String s= "ABC";
        String s1 = "ABC";
        String s2 = "ABCD";

        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.equals(s1)); // true
        System.out.println(s.equals(s2)); // false
    }
}
