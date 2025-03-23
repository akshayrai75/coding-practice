package easy;

public class CanPlaceFlowers {
    /**
     * <b>Can Place Flowers</b><br>
     * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot
     * be planted in adjacent plots.<br>
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an
     * integer n, return true if n new flowers can be planted in the flowerbed without violating the
     * no-adjacent-flowers rule and false otherwise.<br>
     * @Example-1:
     * Input: flowerbed = [1,0,0,0,1], n = 1<br>
     * Output: true<br>
     * @Example-2:
     * Input: flowerbed = [1,0,0,0,1], n = 2<br>
     * Output: false<br>
     * */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length <2)
            if (flowerbed[0] == 0)
                return true;
            else return n == 0;
        for (int i = 0; i < flowerbed.length-1; i++) {
            if (n==0) return true;
            if (i==0 && flowerbed[i] == 0 && flowerbed[i+1]==0) {
                n--;
                flowerbed[i] = 1;
            }
            else if (i!=0 && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
        }
        if (flowerbed[flowerbed.length-2] == 0 && flowerbed[flowerbed.length-1] == 0) n--;
        return n==0;
    }
}
