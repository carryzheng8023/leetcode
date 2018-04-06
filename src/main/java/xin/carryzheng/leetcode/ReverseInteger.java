package xin.carryzheng.leetcode;

/**
 * #7
 * @author zhengxin
 * @date 2018-03-18 20:33:34
 */


/**
 * Description

 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output:  321
 Example 2:

 Input: -123
 Output: -321
 Example 3:

 Input: 120
 Output: 21

 题意是给你一个整型数，求它的逆序整型数，
 而且有个小坑点，当它的逆序整型数溢出的话，那么就返回 0，
 用我们代码表示的话可以求得结果保存在 long 中，最后把结果和整型的两个范围比较即可。
 * */
public class ReverseInteger {

    public static int reverse(int x){

        long res = 0;

        for (; x!=0; x /= 10){
            res = res * 10 + x % 10;
        }

        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int)res;

    }
    public static void main(String[] args){

        System.out.println(reverse(-23));

    }


}
