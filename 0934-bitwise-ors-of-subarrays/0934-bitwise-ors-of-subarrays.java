class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> resSet = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        for (int num : arr) {
            Set<Integer> curr = new HashSet<>();
            curr.add(num);
            for (int x : prev) {
                curr.add(num | x);
            }
            resSet.addAll(curr);
            prev = curr;
        }
        return resSet.size();
    }
}