package leetcode_75;

//605. Can Place Flowers
//        Easy
//        6K
//        1.1K
//        Companies
//        You have a long flowerbed in which some of the plots are planted, and some are not.
//        However, flowers cannot be planted in adjacent plots.
//
//        Given an integer array flowerbed containing 0's and 1's,
//        where 0 means empty and 1 means not empty, and an integer n,
//        return true if n new flowers can be planted in the flowerbed without
//        violating the no-adjacent-flowers rule and false otherwise.
//
//
//
//        Example 1:
//
//        Input: flowerbed = [1,0,0,0,1], n = 1
//        Output: true
//        Example 2:
//
//        Input: flowerbed = [1,0,0,0,1], n = 2
//        Output: false
//
//
//        Constraints:
//
//        1 <= flowerbed.length <= 2 * 104
//        flowerbed[i] is 0 or 1.
//        There are no two adjacent flowers in flowerbed.
//        0 <= n <= flowerbed.length

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                // Check if the current plot is empty and its adjacent plots are also empty
                boolean prevEmpty = (i == 0) || (i > 0 && flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (i < length - 1 && flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    // Plant a flower in the current plot
                    flowerbed[i] = 1;
                    count++;

                    // Check if all flowers are planted
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        return count >= n;
    }
}
