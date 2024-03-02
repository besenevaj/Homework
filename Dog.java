public class Dog extends Animal{
    private String name;
    public static int countDog = 0;
    private final int maxRun;
    private final int maxSwim;
    
    Dog(String name) {
        super();
        countDog++;
        this.name = name;
        this.maxRun = 500;
        this.maxSwim = 10;
    }
 
    @Override
    public void run(int range) {
        if (range > maxRun) {
            System.out.println("Собака не может пробежать " + range + " метров.");
        } else {
            System.out.println(name + " пробежал " + range + " метров.");
        }
    }
 
    @Override
    public void swim(int range) {
        if (range > maxSwim) {
            System.out.println("Собака не может проплыть " + range + " метров.");
        } else {
            System.out.println(name + " проплыл " + range + " метров.");
        }
    }
}   
