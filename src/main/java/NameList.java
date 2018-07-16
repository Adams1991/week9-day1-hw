import java.util.ArrayList;
import java.util.Random;

public class NameList {
    private ArrayList<String> names;

    public NameList(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String getRandomName() {
        Random randomizer = new Random();
        String random = getNames().get(randomizer.nextInt(getNames().size()));
        return random;
    }


}
