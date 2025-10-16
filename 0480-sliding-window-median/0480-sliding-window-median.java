import java.util.*;

public class Solution {
    static class Pair implements Comparable<Pair> {
        int key, index;
        Pair(int key, int index) {
            this.key = key;
            this.index = index;
        }
        @Override
        public int compareTo(Pair o) {
            if (this.key != o.key) return Integer.compare(this.key, o.key);
            return Integer.compare(this.index, o.index);
        }
        public int getKey() {
            return key;
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        TreeSet<Pair> t1 = new TreeSet<>();
        TreeSet<Pair> t2 = new TreeSet<>();
        int j = 0;
        double[] a = new double[nums.length - k + 1];
        int m = (k + 1) / 2;

        // initialize first window
        for (int i = 0; i < k; i++) t1.add(new Pair(nums[i], i));
        while (t1.size() > m) t2.add(t1.pollLast());

        if (k % 2 != 0)
            a[j++] = (double) t1.last().getKey();
        else
            a[j++] = ((long)t1.last().getKey() + (long)t2.first().getKey()) / 2.0;

        // slide window
        for (int i = k; i < nums.length; i++) {
            Pair out = new Pair(nums[i - k], i - k);

            if (t1.contains(out)) t1.remove(out);
            else t2.remove(out);

            Pair in = new Pair(nums[i], i);
            if (t2.isEmpty() || in.getKey() < t2.first().getKey())
                t1.add(in);
            else
                t2.add(in);

            // rebalance
            while (t1.size() > m) t2.add(t1.pollLast());
            while (t1.size() < m) t1.add(t2.pollFirst());

            if (k % 2 != 0)
                a[j++] = (double) t1.last().getKey();
            else
                a[j++] = ((long)t1.last().getKey() + (long)t2.first().getKey()) / 2.0;
        }

        return a;
    }
}
