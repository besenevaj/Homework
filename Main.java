public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Рыжик");
        
        Dog sharik = new Dog("Шарик");

        Bowl bowl = new Bowl(10);

        for (Cat cat : cats) {
            cat.eat();
            bowl.decreaseFood(5);
            System.out.println("Количество еды в миске: " + bowl.getFood());
            System.out.println("Кот " + cat.getName() + " сыт: " + cat.isFull());
            System.out.println();
        }
        
        Bowl.addFood(10);
    
        sharik.run(100);
        sharik.swim(100);
        cats[0].run(100);
        cats[0].swim(100);
        
        System.out.println("Животных создано: " + Animal.countAnimal);
        System.out.println("Собак создано: " + Dog.countDog);
        System.out.println("Котов создано: " + Cat.countCat);
    }
}
