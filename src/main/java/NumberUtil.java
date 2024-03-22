public class NumberUtil {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториала отрицательных чисел не существует");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}