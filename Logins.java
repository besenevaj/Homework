import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logins {
    static void parse() {
    List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите логин или пустую строку для завершения: ");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }
}    
