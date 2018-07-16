import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NameListTest {
    private NameList nameList;
    ArrayList<String> nameArray;
    ArrayList<String> nameArray2;

    @Before
    public void setUp(){
        nameArray = new ArrayList<>();
        nameArray2 = new ArrayList<>();
        nameArray.add("Bill");
        nameArray.add("Bob");
        nameArray.add("Hannah");
        nameArray.add("Luna");
        nameList = new NameList(nameArray);
    }

    @Test
    public void getNames() {
        assertEquals(nameArray, nameList.getNames());
    }

    @Test
    public void setNames() {
        nameList.setNames(nameArray2);
        assertEquals(nameArray2, nameList.getNames());
    }

    // used to test randomness but unit test not the best
//    @Test
//    public void canReturnRandomName(){
//        assertEquals("Bill", nameList.getRandomName());
//    }

    @Test
    public void canReturnArrayWithRandomPair (){
        assertEquals(2, nameList.getRandomPair().size());
    }
}