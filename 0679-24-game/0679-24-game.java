class Solution {
    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int c : cards) {
            nums.add((double) c);
        }
        return dfs(nums);
    }

    private boolean dfs(List<Double> nums) {
        // Eğer tek sayı kaldıysa ve 24'e çok yakınsa true
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24.0) < 1e-6;
        }

        // İki sayı seç, işlem yap, yeni liste oluştur
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                List<Double> nextNums = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) {
                        nextNums.add(nums.get(k));
                    }
                }

                // Olası sonuçlar (a+b, a-b, b-a, a*b, a/b, b/a)
                for (double val : generate(nums.get(i), nums.get(j))) {
                    nextNums.add(val);
                    if (dfs(nextNums)) {
                        return true;
                    }
                    nextNums.remove(nextNums.size() - 1); // backtrack
                }
            }
        }
        return false;
    }

    private List<Double> generate(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > 1e-6) res.add(a / b);
        if (Math.abs(a) > 1e-6) res.add(b / a);
        return res;
    }
}