import java.util.ArrayList;
import java.util.Collection;
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


    public ArrayList<String> getRandomPair() {
        ArrayList<String> randomPair = new ArrayList<>();

        String randomName1 = getRandomName();
        String randomName2 = getRandomName();

        randomPair.add(randomName1);
        randomPair.add(randomName2);

        return randomPair;
    }
}
