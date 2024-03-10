import java.util.*;

public class Highload {
    static void print() {
        List<String> collection = new ArrayList<String>(Arrays.asList("Highload", "High", "Load", "Highload"));

        long count = collection.stream()
                .filter(s -> s.equals("High"))
                .count();
                
        String firstElement = collection.stream()
                .findFirst()
                .orElse("0");

        String lastElement = collection.stream()
                .reduce((a, b) -> b)
                .orElse("0");

        System.out.println("Количество раз, которые объект \"High\" встречается в коллекции: " + count);
        System.out.println("Первый элемент коллекции: " + firstElement);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}
