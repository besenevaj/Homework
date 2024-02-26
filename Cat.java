public class Cat extends Animal {
    private String name;
    private boolean isFull;
    public static int countCat = 0;
 
    Cat (String name) {
        super();
        countCat++;
        this.name = name;
        this.isFull = false;
    }
 
    @Override
    public void run(int range) {
        if (range > 200) {
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
    if (isFull == false && Bowl.food > 0) {
        System.out.println(name + " поел.");
        isFull = true;
    } else {
        System.out.println(name + " голоден.");
        }
    }
    
    public boolean isFull() {
        return isFull;
    } 

    public String getName() {
        return name;
    }
}
