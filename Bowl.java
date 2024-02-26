public class Bowl {
    public static int food;
    
    public Bowl(int food) {
        this.food = food;
    }

    public static void addFood(int amount) {
        food += amount;
        System.out.println("В миску добавлено " + amount);
        System.out.println();
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }
    public int getFood() {
        return food;
    }
}
