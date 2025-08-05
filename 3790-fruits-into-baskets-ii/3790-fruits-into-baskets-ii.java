class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length, res = 0;

        for (int i = 0; i < n; i++) {
            boolean notFound = true;
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= fruits[i]) {
                    baskets[j] = 0;
                    notFound = false;
                    break;
                }
            }
            if (notFound) res++;
        }
        return res;
    }
}