package xin.carryzheng.leetcode;

/**
 * Created by zhengxin on 17/12/14.
 */
public class Util {

    public static void traverse(int[] n){

        if (null == n)
            return;

        for (int i=0; i<n.length; i++){
            System.out.print(n[i] + "\t");
        }
    }

}
