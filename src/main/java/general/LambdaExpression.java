package general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {
        SumOfTwoNumbers sum = (a, b) -> a+b;
        System.out.println(sum.sum(7,4));
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,5,6,9,1);
        System.out.println(integerList.stream().reduce((a,b)->a*b).get());
        System.out.println(integerList.stream().max((a,b)->b-a).get());
        System.out.println(integerList.stream().filter(a->a%2==0).collect(Collectors.toList()));
        System.out.println(integerList.stream().map(a->a*a).collect(Collectors.toList()));
        System.out.println(integerList.stream().sorted((a,b)->b-a).collect(Collectors.toList()));
        integerList.stream().skip(2).forEach(e->System.out.print(e+" "));
        integerList.stream().distinct().collect(Collectors.toMap(e->e,e->e*e)).forEach((k,v)->System.out.print(k+":"+v+" "));
        System.out.println();
        integerList.stream().limit(3).forEach(e-> System.out.print(e+" "));
        System.out.println();
        integerList.stream().max((a,b)->a-b).ifPresent(System.out::println);
        integerList.stream().distinct().collect(Collectors.toList()).forEach(e-> System.out.print(e+" "));
        System.out.println();
        integerList.stream().peek(System.out::print).peek(e-> System.out.print(":")).forEach(e-> System.out.println(e*e));
        HashMap<Integer,String> hashMap = new HashMap<>();
    }
}

@FunctionalInterface
interface SumOfTwoNumbers {
    int sum(int a,int b);
    default void printSome(){
        System.out.println("Print");
    }
}
class SumOfTwoNumbersImpl implements SumOfTwoNumbers{

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public void printSome() {
        //SumOfTwoNumbers.super.printSome();
        System.out.println("Print child");
    }

    public static void main(String[] args) {

    }
}
