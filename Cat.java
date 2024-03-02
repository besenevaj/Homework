public class Cat extends Animal {
    private String name;
    private boolean isFull;
    private int appetite;
    public static int countCat = 0;
    private final int maxRun;
 
    Cat (String name) {
        super();
        countCat++;
        this.name = name;
        this.isFull = false;
        this.appetite = 5;
        this.maxRun = 200;
    }
 
    @Override
    public void run(int range) {
        if (range > maxRun) {
            System.out.println(name + " не может пробежать " + range + "метров.");
        } else {
            System.out.println(name + " пробежал " + range + " метров.");
        }
    }
 
    @Override
    public void swim(int range) {
        System.out.println("Коты не могут плавать.");
    }

    public void eat() {
    if (isFull == false && Bowl.food >= appetite) {
        System.out.println(name + " поел.");
        isFull = true;
        Bowl.decreaseFood(appetite);
    } else {
        System.out.println(name + " голоден.");
        Bowl.decreaseFood(appetite);
        }
    }
    
    public boolean isFull() {
        return isFull;
    } 

    public String getName() {
        return name;
    }
}
