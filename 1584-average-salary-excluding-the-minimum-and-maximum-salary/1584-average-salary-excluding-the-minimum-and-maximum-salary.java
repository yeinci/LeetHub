class Solution {
    public double average(int[] salary) {
        int n = salary.length, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int num = salary[i];
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        sum -= max + min;
        return sum / (n - 2);
    }
}