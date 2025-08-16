class Solution {
    public int maximum69Number (int num) {
        int tmp = num;
        int i = 0, last6 = -1;;
        while (tmp > 0) {
            if (tmp % 10 == 6) last6 = i;
            tmp /= 10;
            i++;
        }
        if (last6 == -1) return num;
        return num + 3 * (int)Math.pow(10, last6);
    }
}