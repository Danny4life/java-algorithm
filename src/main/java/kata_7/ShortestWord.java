package kata_7;

//Simple, given a string of words, return the length of the shortest word(s).
//
//        String will never be empty and you do not need to account for different data types.

// find the shortest word
// then return the shortest word

public class ShortestWord {

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps me"));
    }

    public static int findShort(String s) {
        int min = s.length();


        for (String each : s.split(" ")){
            if(each.length() < min){
                min = each.length();
            }
        }

                return min;
    }
}
