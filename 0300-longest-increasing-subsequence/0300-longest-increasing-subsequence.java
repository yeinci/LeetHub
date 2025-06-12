class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> tails = new ArrayList<>();

        for (int num : nums) {
            int left = 0, right = tails.size() - 1;
            int i = tails.size();

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (tails.get(mid) >= num) {
                    i = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (i == tails.size()) {
                tails.add(num);
            } else {
                tails.set(i, num);
            }
        }
        return tails.size();
    }
}