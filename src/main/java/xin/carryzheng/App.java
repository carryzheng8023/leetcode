package xin.carryzheng;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        int[] nums = new int[]{1, 3, 5, 6};

        System.out.println(indexOf(nums, 6));

    }

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + ((hi - lo) >> 1);
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
