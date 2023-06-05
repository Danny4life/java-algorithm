package kata_7;
//
//Task
//        You are given a string representing a number in binary.
//        Your task is to delete all the unset bits in this string and return
//        the corresponding number (after keeping only the '1's).
//
//        In practice, you should implement this function:
//
//public long eliminateUnsetBits(String number);
//        Examples
//        eliminateUnsetBits("11010101010101") ->  255 (= 11111111)
//        eliminateUnsetBits("111") ->  7
//        eliminateUnsetBits("1000000") -> 1
//        eliminateUnsetBits("000") -> 0
//
//
//        import org.junit.Test;
//        import static org.junit.Assert.assertEquals;
//        import org.junit.runners.JUnit4;
//
//public class SampleTests {
//    SetBits sb = new SetBits();
//    @Test
//    public void sampleTests() {
//        assertEquals(sb.eliminateUnsetBits("11010101010101"), 255);
//        assertEquals(sb.eliminateUnsetBits("111"), 7);
//        assertEquals(sb.eliminateUnsetBits("1000000"), 1);
//    }
//}

//thinking
// the string represents a number in binary
//                1*2^2 + 1*2^1 + 1*2^0
//  4+2+1=7
//111

public class Intruders {

    public static void main(String[] args) {
        System.out.println(eliminateUnsetBits("1000000"));
    }

    public static long eliminateUnsetBits(String number) {
        // TODO
        StringBuilder binary = new StringBuilder();
        for(char c : number.toCharArray()){
            if(c == '1'){
                binary.append(c);
            }
        }

        return binary.length() > 0 ? Long.parseLong(binary.toString(), 2) : 0;
    }
}
