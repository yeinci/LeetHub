class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> records = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("+")) {
                records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
            } else if (op.equals("D")) {
                records.add(2 * records.get(records.size() - 1));
            } else if (op.equals("C")) {
                records.remove(records.size() - 1);
            } else {
                records.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int num : records) {
            sum += num;
        }
        return sum;
    }
}