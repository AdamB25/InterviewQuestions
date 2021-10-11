package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("hacı","erhan","barış","burak"));
        System.out.println("names = " + names);
        List<String> collect = names.stream().map((s) -> {
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("collect = " + collect);
        Predicate<String> isContainsC=(p) -> {
            return p.contains("c");
        };

        List<String> collect1 = names.stream().filter(isContainsC).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}
