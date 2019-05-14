package xin.carryzheng;

/**
 * Created by zhengxin on 17/12/14.
 */
public class Utils {

    public static void traverse(int[] n) {

        if (null == n)
            return;

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "\t");
        }
    }

    public static void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node + "\t");
        inOrder(node.right);
    }


}
