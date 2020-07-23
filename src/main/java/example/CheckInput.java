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
        final char[] chars = s.toCharArray();
        Set set = new HashSet<Character>();
        for (int i = 0; i < chars.length ; i++) {
            set.add(chars[i]);
        }
        return set.size()==4;
    }
}
