import java.util.*;

class Operators {
    public static void main(String[] args) {
        int a1 = 10 + 20;
        String a2 = "10" + 10;
        int a3 = 'a' + 10;
        String a4 = "hi" + 'a';
        //String a5 = true + 'a';
        String a6 = false + "hi";
        String a7 = '1' + "hi";
        String a8 = false + "true";
        //int a9 = 10 + true;
        String a10 = "ja" + 10;

        System.out.println(a1 + "\n" + a2 + "\n" + a3 + "\n" + a4 + "\n" +  a6 + "\n" + a7 + "\n" + a8 + "\n"
                + "\n" + a10);
    }
}