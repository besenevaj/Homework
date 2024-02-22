public class Person {
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Person(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
        }

    @Override
    public String toString(){
        return String.format("ФИО: " + name + ", должность: " + position + ", email: " + email
        + ", телефон: " + phone_number + ", зарплата: " + salary + ", возраст: " + age);
    }

    public void print(){
        System.out.println(this);
        }


    public static void main(String[] args)  {

        Person[] persArray = new Person[5];
                persArray[0] = new Person("Ivanov Ivan", "Engineer", 
    "ivivan@mailbox.com", "892312312", 30000, 30);
                persArray[1] = new Person("Petrov Petr", "Java Developer",
    "petrpetrov@mailbox.com", "891555535", 50000, 26);
                persArray[2] = new Person("Svetlana Sidorova", "Project Manager", 
    "svesidorova@mail.ru", "893455125", 40000, 29);
                persArray[3] = new Person("Maria Fedorova", "Accountant", 
    "marfedorova@gmail.com", "836767348", 35000, 32);
                persArray[4] = new Person("Igor Sergeev", "Quality Assurance",
    "serigor@mailbox.com", "893700100", 45000, 27);
    
        for (int i=0; i < persArray.length; i++)
        persArray[i].print();
    }
}
