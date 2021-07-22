package xin.carryzheng.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * #5
 *
 * @author zhengxin
 * @date 2021-04-03 19:22:36
 */
public class LongestPalindromicSubstring {

    private int start = 0;
    private int maxLength = 1;

    public static void main(String[] args) {

        System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("cabbad"));

    }

    public String longestPalindrome(String s) {

        if(s.length() < 2) {
          return s;
        }

        char[] chars = s.toCharArray();


        for (int i=0; i<chars.length; i++){
            expandAroundCenter(chars, i-1, i+1);
            expandAroundCenter(chars, i, i+1);
        }

        return s.substring(start, start+maxLength);
    }

    // [a, b, a]
    private void expandAroundCenter(char[] chars, int left, int right){

        while (left >=0 && right < chars.length && chars[left] == chars[right]){
            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
        }

    }
}
