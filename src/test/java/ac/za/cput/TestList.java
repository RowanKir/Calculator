package ac.za.cput;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;

import java.util.Collection;


public class TestList implements Abstract {

    public class TestList extends AbstractTestCollection
    {
        private List<String> subjects;

        public void initialize()
        {
            subjects = new ArrayList<>();

            subjects.add("ADP");
            subjects.add("ADT");
            subjects.add("ITS");

        }

        public void test()
        {
            Assert.assertEquals("3", subjects.size());

        }

        public void end()
        {
            subjects = null;
        }
}
