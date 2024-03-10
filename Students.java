import java.util.*;
import java.util.stream.Collectors;

public class Students {
    Collection<Student> students = Arrays.asList(
               new Student("Дмитрий", 17, Gender.MAN),
               new Student("Максим", 20, Gender.MAN),
               new Student("Екатерина", 20, Gender.WOMAN),
               new Student("Михаил", 28, Gender.MAN)
       );
   private enum Gender {
       MAN,
       WOMAN
   }
   private static class Student {
       private final String name;
       private final Integer age;
       private final Gender gender;
       public Student(String name, Integer age, Gender gender) {
           this.name = name;
           this.age = age;
           this.gender = gender;
       }
       public String getName() {
           return name;
       }
       public Integer getAge() {
           return age;
       }
       public Gender getGender() {
           return gender;
       }
       @Override
       public String toString() {
           return "{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", gender=" + gender +
                   '}';
       }
       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (!(o instanceof  Student)) return false;
           Student student = (Student) o;
           return Objects.equals(name, student.name) &&
                   Objects.equals(age, student.age) &&
                   Objects.equals(gender, student.gender);
       }
       @Override
       public int hashCode() {
           return Objects.hash(name, age, gender);
       }
   }
   static void print () {
       Students students = new Students();
       List<Student> studentsMayBeDrafted = students.students.stream()
        .filter(student -> student.age >= 18 && student.age <= 27 && student.gender == Gender.MAN)
        .collect(Collectors.toList());
        
        double averageAgeOfMaleStudents = students.students.stream()
        .filter(student -> student.gender == Gender.MAN)
        .mapToInt(Student::getAge)
        .average().getAsDouble();
        
        System.out.println("Может получить повестку:");
        System.out.println(studentsMayBeDrafted);
        System.out.println("Средний возраст студентов мужского пола:");
        System.out.println(averageAgeOfMaleStudents);
   }
}   
