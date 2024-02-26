public class Animal {
    static int countAnimal = 0;
    Animal() {
        countAnimal++;
    }
    
    public void run (int range) {
        System.out.println("Животное пробежало " + range + " метров.");
    }
    
    public void swim (int range) {
        System.out.println("Животное проплыло " + range + " метров.");
    }
}
