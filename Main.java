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
        System.out.println();
        
        sharik.run(100);
        sharik.swim(100);
        cats[0].run(100);
        cats[0].swim(100);
        System.out.println();
        
        System.out.println("Животных создано: " + Animal.countAnimal);
        System.out.println("Собак создано: " + Dog.countDog);
        System.out.println("Котов создано: " + Cat.countCat);
        System.out.println();
        
        Circle circle = new Circle(5);
        circle.setFillColor("Красный");
        circle.setBorderColor("Чёрный");
        circle.printCharacteristics();
        System.out.println();
        
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Синий");
        rectangle.setBorderColor("Зелёный");
        rectangle.printCharacteristics();
        System.out.println();
        
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Жёлтый");
        triangle.setBorderColor("Оранжевый");
        triangle.printCharacteristics();
        System.out.println();
    }
}
