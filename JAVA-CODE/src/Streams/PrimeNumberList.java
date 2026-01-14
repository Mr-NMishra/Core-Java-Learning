package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberList {
    /*
    list of a prime number from a list and collect them
     */

    static Predicate<Integer> predicate=s->{
        if(s==2)
            return true;
        else if(s%2==0)
            return false;
        else {
            for(int i=2;i<s/2;i++){
                if(s%i==0)
                    return false;
            }
            return true;
        }
    };
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        List<Integer> primeNUmberList=numbers.stream().filter(predicate).collect(Collectors.toList());

        primeNUmberList.stream().forEach(s-> System.out.println(s));

        //more conscise and efficient
        //Math.sqrt() is far more efficent than i/2;
        //if s>1 then only stream generate
        //we use intStream.rangeclosed() which is more efficient than loop

        System.out.println("concise and more efficient way");
        List<Integer> ConciseList=numbers.stream().filter(s->s>1 && IntStream.rangeClosed(2,(int)Math.sqrt(s)).noneMatch(i->s%i==0)).toList();
        ConciseList.stream().forEach(s-> System.out.println(s));
    }
}
