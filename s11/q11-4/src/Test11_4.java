import java.util.*;

public class Test11_4 {
    public static void main(String[] args) {
        //list
        String[] nameList = {
                "aaaa",
                "bbbb",
                "cccc",
                "dddd",
                "eeee",
                "cccc"
        };
        System.out.println(Arrays.toString(nameList));
        //ArrayList
        ArrayList nameArrayList = new ArrayList<>(Arrays.asList(nameList));
        System.out.println(nameArrayList.toString());
        //LinkedList
        LinkedList<String> nameLinkedList = new LinkedList<>(Arrays.asList(nameList));
        System.out.println(nameLinkedList.toString());
        //HashSet
        HashSet<String> nameHashSet = new HashSet<>(Arrays.asList(nameList));
        System.out.println(nameHashSet.toString());
        //LinkedHashSet
        LinkedHashSet<String> nameLinkedHashSet = new LinkedHashSet<>(Arrays.asList(nameList));
        System.out.println(nameLinkedHashSet.toString());
        //TreeSet
        TreeSet<String> nameTreeSet = new TreeSet<>(Arrays.asList(nameList));
        System.out.println(nameTreeSet.toString());
    }
}
