package kata_7;

//A squared string is a string of n lines, each substring being n characters long.
//        We are given two n-squared strings. For example:
//
//        s1 = "abcd\nefgh\nijkl\nmnop" s2 = "qrst\nuvwx\nyz12\n3456"
//
//        Let us build a new string strng of size (n + 1) x n in the following way:
//
//        The first line of strng has the first char of the first line of s1 plus the
//        chars of the last line of s2.
//        The second line of strng has the first two chars of the second line of s1 plus
//        the chars of the penultimate line of s2 except the last char
//        and so on until the nth line of strng has the n chars of the nth line of s1 plus
//        the first char of the first line of s2.
//        Calling this function compose(s1, s2) we have:
//
//        compose(s1, s2) -> "a3456\nefyz1\nijkuv\nmnopq"
//        or printed:
//        abcd    qrst  -->  a3456
//        efgh    uvwx       efyz1
//        ijkl    yz12       ijkuv
//        mnop    3456       mnopq

//public class ComposingTest {
//
//    private static void testing(String actual, String expected) {
//        assertEquals(expected, actual);
//    }
//    private static int randInt(int min, int max) {
//        return (int)(min + Math.random() * ((max - min) + 1));
//    }
//    @Test
//    public void test() {
//        System.out.println("Fixed Tests compose");
//        testing(Composing.compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"),
//                "bNkTB\nhTrWO\nRTFVi\nCnnIj");
//        testing(Composing.compose("HXxA\nTGBf\nIPhg\nuUMD", "Hcbj\nqteH\nGbMJ\ngYPW"),
//                "HgYPW\nTGGbM\nIPhqt\nuUMDH");
//        testing(Composing.compose("tSrJ\nOONy\nsqPF\nxMkB", "hLqw\nEZuh\nmYFl\nzlYf"),
//                "tzlYf\nOOmYF\nsqPEZ\nxMkBh");
//    }
//}


public class Compose {

    public static void main(String[] args) {
        System.out.println(compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
    }

    public static String compose(String s1, String s2) {
        // your code

        String[] l1 = s1.split("\n");
        String[] l2 = s2.split("\n");

        int newLine = l1.length;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < newLine; i++)
           // StringBuilder sb1 = new StringBuilder();
           sb.append(l1[i].substring(0, i + 1) + l2[newLine-i-1].substring(0, newLine - 1)).append("\n");

        return sb.toString().trim();
    }
}


//    String[] s1Lines = s1.split("\n");
//    String[] s2Lines = s2.split("\n");
//    int n = s1Lines.length;
//    StringBuilder sb = new StringBuilder();
//		for(int i=0;i<n;i++)
//        sb.append(s1Lines[i].substring(0, i+1) + s2Lines[n-1-i].substring(0,n-i)).append("\n");
//        return sb.toString().trim();
