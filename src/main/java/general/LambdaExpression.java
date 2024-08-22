package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {
        SumOfTwoNumbers sum = (a,b)-> a+b;
        System.out.println(sum.sum(7,4));
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(integerList.stream().reduce((a,b)->a+b).get());
        System.out.println(integerList.stream().filter(a->a%2==0).collect(Collectors.toList()));
        System.out.println(integerList.stream().map(a->a*a).collect(Collectors.toList()));
        System.out.println(integerList.stream().sorted((a,b)->b-a).collect(Collectors.toList()));
        integerList.stream().skip(4).forEach(System.out::println);

    }
}
class Person {
    String key,value;
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person p = new Person();
        p.key="problemstatement";
        p.value="Check engine light is on";
        people.add(p);
        p = new Person();
        p.key="Wororder";
        p.value="MNT_DIDS_WO_912032931";
        people.add(p);
        people.stream().forEach(e->System.out.println(e.key+" "+e.value));
    }
}
@FunctionalInterface
interface SumOfTwoNumbers {
    int sum(int a,int b);
}
