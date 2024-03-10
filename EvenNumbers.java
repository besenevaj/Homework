import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class EvenNumbers {
    static void print() {

    ArrayList<Integer> AL = new ArrayList<Integer>();
    int number;
    Random rnd = new Random();

    for (int i = 0; i < 10; i++) {
      number = rnd.nextInt() % 100;
      AL.add(number);
    }

    System.out.println("Набор рандомных чисел:");
    System.out.println(AL);
    
    System.out.println("Количество чётных чисел:");
    long count = AL.stream().filter(i -> i%2 == 0).count();
    System.out.println(count);
  }
}
