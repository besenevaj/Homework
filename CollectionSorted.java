import java.util.*;

public class CollectionSorted {
    static void print() {
        List<String> collection = new ArrayList<String>
        (Arrays.asList("f10", "a15", "f2", "f4", "f5", "b54", "a16"));
        
        Collections.sort(collection, (s1, s2) -> {
            String alphabetic1 = s1.replaceAll("\\d", "");
            String alphabetic2 = s2.replaceAll("\\d", "");
            if (!alphabetic1.equals(alphabetic2)) {
                return alphabetic1.compareTo(alphabetic2);
            } else {
                return Integer.parseInt(s1.replaceAll("[^0-9]", ""))
                        - Integer.parseInt(s2.replaceAll("[^0-9]", ""));
            }
        });

        String[] array = new String[collection.size()];
        collection.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
