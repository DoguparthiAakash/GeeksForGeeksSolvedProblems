class Solution {
    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            int original = num;
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            if (original != rev) {
                return false;
            }
        }
        return true;
    }
}