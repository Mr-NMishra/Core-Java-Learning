package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    /*
        Find the longest string in a list of strings using Java streams
     */
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        //here we are using max() terminal operator
        //oOmaprator.compareInt : It compares string based on their length

         Optional<String> string=strings.stream().max(Comparator.comparingInt(s->s.length()));
        System.out.println(string.get());
    }
}
