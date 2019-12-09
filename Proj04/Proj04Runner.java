import java.util.*;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;

class Proj04Runner {

    Proj04Runner() {
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Caroline Kim\n");
        }

    public Collection getCollection(String[] myArray) {
        List<String> myWords = Arrays.asList(myArray);
        Set<String> mySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        mySet.addAll(myWords);

        List<String> list = new ArrayList<String>(mySet);
        Collections.sort(list, Collections.reverseOrder());

        return list;
    }



}