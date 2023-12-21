import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int f = 0;
        int l = 0;
        int length = 0;
        Set<Character> set = new HashSet<>();
        while(l != s.length() - 1) {
            if(!set.contains(s.charAt(l))) {
                set.add(s.charAt(l));
                l++;
                length = Math.max(set.size(), length);
            } else {
                set.remove(s.charAt(f));
                f++;
            }
        }
        System.out.println(set);

        return length;
    }
}
