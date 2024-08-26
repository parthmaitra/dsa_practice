package interview;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PersonFiltersWithStream {
    public static void main(String[] args) {
        List<Person1> persons = Arrays.asList(
                new Person1("Alice", 23, 40000),
                new Person1("Bob", 30, 60000),
                new Person1("Charlie", 22, 70000),
                new Person1("David", 23, 80000)
        );
        persons.stream().filter(e->e.getAge()<25).forEach(e->System.out.println(e.getName().toUpperCase()));
        List<Person1> newList = persons.stream()
                .peek(e->e.setSalary((int)(e.getSalary()*1.1)))
                .collect(Collectors.toList());
        System.out.println(newList);
        persons.forEach(System.out::println);
    }
}
class Person1{
    String name;
    int age;
    int salary;

    public Person1(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}