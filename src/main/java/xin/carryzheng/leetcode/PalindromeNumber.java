package xin.carryzheng.leetcode;

/**
 * #9
 * 判断是否是回文
 * @author zhengxin
 * @date 2018-03-18 20:46:13
 */
public class PalindromeNumber {

    public static void main(String[] args){
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(100010));
    }


    public static boolean isPalindrome(int x){

        if(x < 0 || x % 10 == 0) return false;

        int copyX = x;

        int reverse = 0;

        for (; copyX > 0; copyX /= 10)
            reverse = reverse * 10 + copyX % 10;

        return x == reverse;

    }

}
