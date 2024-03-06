public class Main {
    public static void main(String[] args){
        Array.uniqueWords();
        System.out.println();
        PhoneBook pB = new PhoneBook();
        pB.add("Петров", "+79011234567");
        pB.add("Иванов", "+79025674321");
        pB.add("Петров", "+79998763512");
        pB.get("Петров");
        pB.get("Иванов");
        }
    }
