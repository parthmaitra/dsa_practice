package general;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamComparison{
    int size;
    public static void main(String[] args) {
        StreamComparison s = new StreamComparison();
        s.size=10000000;
        ArrayList<Person> people = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i< s.size;i++){
            people.add(new Person(random.nextInt(100),"John"));
        }
        long startStream = System.currentTimeMillis();
        List<Person> peopleUnder25 = people.stream().parallel().filter(e->e.age<25).collect(Collectors.toList());
        long endStream = System.currentTimeMillis();
        System.out.println(peopleUnder25.size()+" "+(float)(endStream-startStream)/1000);
        peopleUnder25.clear();
        startStream = System.currentTimeMillis();
        for(Person person:people){
            if(person.age<25)
                peopleUnder25.add(person);
        }
        endStream = System.currentTimeMillis();
        System.out.println(peopleUnder25.size()+" "+(float)(endStream-startStream)/1000);
    }
}
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}