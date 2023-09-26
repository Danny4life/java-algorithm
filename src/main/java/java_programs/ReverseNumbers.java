package java_programs;

public class ReverseNumbers {

    public static void main(String[] args) {
        int numbers = 1234567;
        int result = 0;

        for(int i = numbers; i != 0; i = i / 10){
            int reverseNum = i % 10;

            result = result * 10 + reverseNum;
        }

        System.out.println(result);
    }
}
