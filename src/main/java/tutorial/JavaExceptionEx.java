package tutorial;

import java.util.Arrays;

public class JavaExceptionEx {
    public static void main(String[] args) {


        int[] a = new int[5];
        a[4] = 50;

        System.out.println(Arrays.toString(a));

        try{
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);

        }
        System.out.println("rest of the code");


    }
}

