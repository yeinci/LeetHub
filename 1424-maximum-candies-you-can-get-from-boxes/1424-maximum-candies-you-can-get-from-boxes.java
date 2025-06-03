class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int candy = 0;
        Queue<Integer> openBoxes = new LinkedList<>();
        LinkedList<Integer> lockedBoxes = new LinkedList<>();

        for (int box : initialBoxes) {
            if (status[box] == 1) {
                openBoxes.offer(box);
            } else {
                lockedBoxes.add(box);
            }
        }

        while (!openBoxes.isEmpty()) {
            while (!openBoxes.isEmpty()) {
                int box = openBoxes.poll();
                candy += candies[box];
                for (int key : keys[box]) {
                    status[key] = 1;
                }
                for (int containedBox : containedBoxes[box]) {
                    if (status[containedBox] == 1) {
                        openBoxes.offer(containedBox);
                    } else {
                        lockedBoxes.add(containedBox);
                    }
                }
            }
            Iterator<Integer> it = lockedBoxes.iterator();
            while (it.hasNext()) {
                int box = it.next();
                if (status[box] == 1) {
                    openBoxes.offer(box);
                    it.remove();
                }
            }
        }
        return candy;
    }
}