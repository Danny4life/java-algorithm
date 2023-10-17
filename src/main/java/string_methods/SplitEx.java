package string_methods;

public class SplitEx {

    public static void main(String[] args) {
        String s = "the javatpoint is good to learn java";
        String [] word = s.split("\\s");


        for(String w : word){
            System.out.println(w);
        }
    }
}
