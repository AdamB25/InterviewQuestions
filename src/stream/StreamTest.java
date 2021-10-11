package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Erhan","Barış","Selim"));

        List<String> collect = names.stream().map((p) -> {
            return p.substring(0, 3);
        }).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        int x=19;
        // if x bigger than 0 true else false

      String b=  check(x);
        System.out.println("b = " + b);

        Function<Integer,Integer> ternar= (p)->{ return  (p % 2 == 0) ? p * p * p : p * p;};

        Function<Integer,Integer> ter=p -> {
            if (p % 2 == 0)
                return p * p * p;
            else
                return p * p;

        };

        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> collect1 = numbers.stream().filter(p->p<5).map(ternar).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

    }

    private static String check(int x) {

      return  (x>0) ? "true": "false";


       /*
        if (x >0)
            return "true";
            else
                return "false";
                */

    }
}
