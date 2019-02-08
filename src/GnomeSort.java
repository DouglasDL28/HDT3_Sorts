public class GnomeSort implements Comparable<Integer> {
    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    private static void gnomeSort(int[] ar) {
        int i = 1;
        int n = ar.length;
        while (i < n) {
            if (i == 0 || ar[i - 1] <= ar[i]) {
                i++;
            } else {
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[--i] = tmp;
            }
        }
    }
}

