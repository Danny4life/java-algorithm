package kata_8;

//You're at the zoo... all the meerkats look weird. Something has gone terribly wrong -
//        someone has gone and switched their heads and tails around!
//
//        Save the animals by switching them back. You will be given an array which will have three values
//        (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round
//        (head, body, tail).
//
//        Same goes for all the other arrays/lists that you will get in the tests: you have to change the
//        element positions with the same exact logics
//
//        Simples!

// the head and tail of animals has been switched to tail body head
// switch it back to head body tail
// body is constant, reverse tail and head

// steps
// reverse first with last, middle stays

import java.util.Arrays;

public class MyHead {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs" })));
    }

    public static String[] fixTheMeerkat(String[] arr) {
//       StringBuilder reverse = new StringBuilder();
//
//       for(int i = arr.length; i > 0; i--){
//           reverse.append(arr[i - 1]).append(" ");
//       }
//
//       String[] revArray = reverse.toString().split(" ");
//
//       return revArray;

        return new String[] {arr[2], arr[1], arr[0]};
    }
}
