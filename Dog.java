public class Dog extends Animal{
    private String name;
    public static int countDog = 0;
    
    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }
 
    @Override
    public void run(int range) {
        if (range > 500) {
            System.out.println("Собака не может пробежать " + range + " метров.");
        } else {
            System.out.println(name + " пробежал " + range + " метров.");
        }
    }
 
    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не может проплыть " + range + " метров.");
        } else {
            System.out.println(name + " проплыл " + range + " метров.");
        }
    }
}    
