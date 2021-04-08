package xin.carryzheng.leetcode;

import java.util.*;

/**
 * #49 字母异位分组
 *
 * @author zhengxin
 * @date 2021-04-08 11:19:08
 */
public class GroupAnagrams {

    public static void main(String[] args) {

//        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat", "ate", "tea", "tan", "nat", "bat"}));
//        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"abc", "efg"}));

        //["bdddddddddd","bbbbbbbbbbc"]
        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"bdddddddddd", "bbbbbbbbbbc"}));

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        int[] chars = new int[26];

        for(String str : strs){
            Arrays.fill(chars, 0);
            for (int i=0; i<str.length(); i++){
                int ascii = str.charAt(i) - 97;
                chars[ascii] += 123;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i=0; i<26; i++)
                sb.append(chars[i]).append(".");

            String key = sb.toString();

            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());

    }
}
