import java.util.*;

public class Array {
    public static void uniqueWords() {
        List<String> words = Arrays.asList("Пушкин", "Достоевский", "Толстой", "Бунин", "Некрасов", "Набоков",
        "Достоевский", "Набоков", "Маяковский", "Фет");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Уникальные слова: ");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
