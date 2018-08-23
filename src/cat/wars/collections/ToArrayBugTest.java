package cat.wars.collections;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wars
 * \* Date: 18-8-12
 * \* Time: 下午5:50
 * \* Description:
 * \
 */

public class ToArrayBugTest {

    public static void main(String[] args) {
        List l = Arrays.asList(args);

        System.out.println(l.toArray());
    }

}
