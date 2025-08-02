class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n = basket1.length;
        Arrays.sort(basket1);
        Arrays.sort(basket2);
        ArrayList<Integer> swap1 = new ArrayList<>();
        ArrayList<Integer> swap2 = new ArrayList<>();

        for (int i = 0, j = 0; i < n || j < n;) {
            int fruit1 = i < n ? basket1[i] : Integer.MAX_VALUE;
            int fruit2 = j < n ? basket2[j] : Integer.MAX_VALUE;
            System.out.println(i + ": " + fruit1 + " " + j + ": " + fruit2);
            if (fruit1 == fruit2) {
                i++;
                j++;
                continue;
            } else if (fruit1 < fruit2) {
                if (i == n - 1 || basket1[i] != basket1[i + 1]) return -1;
                swap1.add(basket1[i]);
                i += 2;
                continue;
            } else {
                if (j == n - 1 || basket2[j] != basket2[j + 1]) return -1;
                swap2.add(basket2[j]);
                j += 2;
            }
        }

        long res = 0;
        int minFruit = basket1[0] < basket2[0] ? basket1[0] : basket2[0];
        
        int m = swap1.size();
        if (m != swap2.size()) return -1;
        
        Collections.sort(swap2, Collections.reverseOrder());
        for (int i = 0; i < m; i++) {
            int a = swap1.get(i);
            int b = swap2.get(i);
            res += Math.min(Math.min(a, b), minFruit * 2);
        }
        return res;
    }
}