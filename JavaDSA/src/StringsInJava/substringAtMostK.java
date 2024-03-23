
package StringsInJava;

import java.util.*;

public class substringAtMostK {
    public static void main(String[] args) {
        String str = "aabcbcdbca";
        int ans=0;
        int  k = 2, i = -1, j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = str.length();
        while (true) {
            while (i < n - 1) {
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.size() <= k) {
                    ans += i-j;
                } else {
                    break;
                }
            }
            if(i == n-1 && map.size() <= k){
                break;
            }
            while(j < i){
                j++;
                char ch = str.charAt(j);
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch) -1);
                }

                if(map.size() > k){
                    continue;
                }
                else{
                    ans += i-j;
                    break;
                }
            }

        }
        System.out.println("number of substring="+ans);
    }
}

