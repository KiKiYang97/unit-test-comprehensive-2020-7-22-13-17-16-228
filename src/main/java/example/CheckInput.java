package example;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:43   2020/7/23
 * @ClassName CheckInput
 */
public class CheckInput {
    public boolean isValid(String s) {
        if (s.length()!=4){
            return false;
        }
        final char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char aChar : chars) {
            if (aChar<'0'||aChar>'9'){
                continue;
            }
            set.add(aChar);
        }
        return set.size()==4;
    }
}
