package xin.carryzheng.leetcode;

/**
 * #70
 * 题意是爬楼梯，每次你只能爬一步或者两步，问到顶层共有多少种方案。
 * 我们假设到顶层共有 f(n) 种，那么 f(n) = f(n - 1) + f(n - 2) 肯定是成立的，
 * 意思就是我们迈向顶层的最后一步是在倒数第一级台阶或者在倒数第二级台阶。
 * 算法我对空间复杂度进行了优化，因为在迭代过程中只需要两个变量即可。
 *
 * @author zhengxin
 * @date 2018-04-03 08:56:19
 */
public class ClimbingStairs {

    public static void main(String[] args){

        System.out.println(climbStairs(4));
        System.out.println(climbStairs2(4));


    }

    public static int climbStairs(int n){

        int a = 1;
        int b = 1;

        while (--n > 0){
            b = a + b;
            a = b - a;
        }

        return b;

    }

    public static int climbStairs2(int n) {
        int[] dp = new int[10000];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

}
