import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random r = new Random(47);
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 8));
        System.out.println("1: " + integers);

        integers.add(2);
        System.out.println("2: " + integers);

        System.out.println("3: " + integers.contains(2));

        integers.remove((Integer)2);//?
        int i = integers.get(2);
        System.out.println("4: " + integers.indexOf(i));

        int j = 10;
        System.out.println("5: " + integers.indexOf(j));

        System.out.println("6: " + integers.remove((Integer)j));

        System.out.println("7: " + integers.remove(i));

        System.out.println("8: " + integers);

        integers.add(3, 11);
        System.out.println("9: " + integers);

        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList: " + sub);

        System.out.println("10: " + integers.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);

        System.out.println("11: " + integers.containsAll(sub));

        Collections.shuffle(sub, r);
        System.out.println("shuffled subList: " + sub);

        System.out.println("12: " + integers.containsAll(sub));

        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);

        copy.retainAll(sub);
        System.out.println("13: " + copy);

        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println("14: " + copy);

        copy.removeAll(sub);
        System.out.println("15: " + copy);

        copy.set(1, 12);
        System.out.println("16: " + copy);

        copy.addAll(2, sub);
        System.out.println("17: " + copy);

        System.out.println("18: " + integers.isEmpty());

        integers.clear();
        System.out.println("19: " + integers);

        System.out.println("20: " + integers.isEmpty());
    }
}
