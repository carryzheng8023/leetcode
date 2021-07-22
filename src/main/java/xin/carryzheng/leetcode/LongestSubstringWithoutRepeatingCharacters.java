package xin.carryzheng.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * #3
 *
 * @author zhengxin
 * @date 2021-04-02 12:25:45
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {

        if (null == s || "".equals(s)) {
          return 0;
        }

        char[] chars = s.toCharArray();


        int maxLength = 0;
        int i = 0;
        int j = 0;

        Set<Character> set = new HashSet<>();

        for(; i<chars.length; i++){
            if(!set.contains(chars[i])){
                set.add(chars[i]);
                maxLength = Math.max(maxLength, set.size());
            }else {
                while(set.contains(chars[i])){
                    set.remove(chars[j]);
                    j++;
                }
                set.add(chars[i]);
            }
        }


        return maxLength;
    }
}
