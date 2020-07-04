package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class NO_3 {
    public int lengthOfLongestSubstring(String s){
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(allUnique(s,i,j)) ans = Math.max(ans, j-i);
            }
        }
        return ans;

    }

    public boolean allUnique(String s,int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public int lengthOfLongestSubString2(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        int rk =-1,ans =0;
        for (int i = 0; i < n; i++) {
            if(i!=0){
                occ.remove(s.charAt(i-1));
            }
            while(rk+1<n&&!occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        NO_3 no_3 = new NO_3();
        String test = "abcabcbb";
        int aa = no_3.lengthOfLongestSubstring(test);
        System.out.println(test+"的无重复字符的最长子串长度为: "+aa);
        int bb = no_3.lengthOfLongestSubString2(test);
        System.out.println(test+"的无重复字符的最长子串长度为: "+bb);
        System.out.println(Integer.toString(1));
        String ss = "123";
        int i = Integer.parseInt(ss);
    }
}
