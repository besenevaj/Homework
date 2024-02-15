import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        System.out.println(checkSum(10, 2));
        checkSign(-3);
        System.out.println(checkSignAgain(5));
        printSeveralTimes("test", 3);
        System.out.println(leapYear(1996));
        arraySwitch();
        arrayOfAHundred ();
        multiplyLessThanSixByTwo ();
        arrayDiagonals ();
        arrayCreating (7, 3);
    }

    public static boolean checkSum (int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <=20;
    }
    
    public static void checkSign (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
    } else {
            System.out.println("Отрицательное");
        }
    }
    
    public static boolean checkSignAgain (int a) {
        return a < 0;
    }
    
    public static void printSeveralTimes (String str, int num) {
        for (int i = 0; i < num; i++) {
        System.out.println(str);
        }
    }
    
    public static boolean leapYear (int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
    public static void arraySwitch () {
        int[] arr = {0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void arrayOfAHundred () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void multiplyLessThanSixByTwo () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void arrayDiagonals () {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[i][i] = 1;
            }
        for (int i = 0; i < 5; i++) {
            arr[i][arr.length -1 - i] = 1;
            }
       Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println); 
    }
    
    public static void arrayCreating (int len, int initialValue) {
        int[] arr = new int[len];
        var i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}   
