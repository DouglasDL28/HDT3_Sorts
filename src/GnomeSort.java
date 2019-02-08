public class GnomeSort{

    public static void gnomeSort (Comparable[] ar) {
        int i = 1;
        int n = ar.length;
        while (i < n) {
            if (i == 0 || ar[i - 1].compareTo(ar[i]) <= 0) {
                i++;
            } else {
                Comparable tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[--i] = tmp;
            }
        }
    }
}

