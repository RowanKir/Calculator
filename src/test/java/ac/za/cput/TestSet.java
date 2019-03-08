package ac.za.cput;

import java.util.HashSet;
import java.util.Set;

public class TestSet implements Abstract {
    Set<Integer> set;

    public void initialize()
    {

        set = new HashSet<>();
        set.add(15);
        set.add(25);
        set.add(35);

    }

    @Override
    public void test() {
        for (Integer i: set)
        {
            Assert.assertEquals(i + "total of i", 75, i + i);

        }

    }


    @Override
    public void end() {
        set = null;

    }
}
