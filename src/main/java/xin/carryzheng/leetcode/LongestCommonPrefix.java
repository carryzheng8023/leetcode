package xin.carryzheng.leetcode;

/**
 * #14
 * 题意是让你从字符串数组中找出公共前缀，
 * 我的想法是找出最短的那个字符串的长度 minLen，
 * 然后在 0...minLen 的范围比较所有字符串，
 * 如果比较到有不同的字符，那么直接返回当前索引长度的字符串即可，
 * 否则最后返回最短的字符串即可。
 *
 * @author zhengxin
 * @date 2018-03-19 14:21:46
 */
public class LongestCommonPrefix {

    public static void main(String[] args){

        String[] strs = new String[]{"m","s"};


        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs){

        int len = strs.length;
        if (len == 0) {
          return "";
        }
        if (len == 1) {
          return strs[0];
        }

        int minLen = Integer.MAX_VALUE;

        for(String str : strs) {
          minLen =  Math.min(minLen, str.length());
        }


        for(int j=0; j<minLen; ++j) //从第j位开始比较 所以从0开始
        {
          for(int i=1; i<strs.length; ++i) //所有的字符串都按位和第一个字符串的每位进行比较，不相等就退出
          {
            if (strs[0].charAt(j) != strs[i].charAt(j)) {
              return strs[0].substring(0, j);
            }
          }
        }

        return strs[0].substring(0, minLen);





    }

}
