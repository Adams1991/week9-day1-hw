import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NameListTest {

    @Before
    public void setUp() throws Exception {
        ArrayList<String> nameArray = new ArrayList<>();
        nameArray.add("Bill");
        nameArray.add("Bob");
        nameArray.add("Hannah");
        nameArray.add("Luna");
        NameList nameList = new NameList(nameArray);
    }

    @Test
    public void getNames() {
    }

    @Test
    public void setNames() {
    }
}