package functionalinterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiConsFuncPred {

    public static void main(String[] args) {
        BiConsumer<String ,String> ınitFullName=(f,l)->{
            System.out.println( f.substring(0, 1).toUpperCase() + "." + l.substring(0, 1).toUpperCase());

        };

        ınitFullName.accept("Barış","altun");

        BiPredicate<String,String> palendrom= (f,s)->{

            if (new StringBuilder(f).reverse().toString().equalsIgnoreCase(s))
                return true;
            else
                return false;


        };

        System.out.println("palendrom.test(\"erre\",\"ERRE\") = " + palendrom.test("erre", "ERRE"));

        BiFunction<Integer,Integer,Double> dvide=(f,s)->{
            return Double.valueOf(f.doubleValue())/s;
        };

        List<String > names=new ArrayList<>(Arrays.asList("Barış","Burak"));
        List<Integer > TC=new ArrayList<>(Arrays.asList(1,2));

        BiFunction<List<String>,List<Integer>, Map<String,Integer>> createMap=(n,t)->{
            Map<String,Integer> result=new HashMap<>();
            for (int i = 0; i < n.size(); i++) {
                result.put(n.get(i),new Integer(t.get(i)));
            }

            return result;
        };
        Map<String, Integer> apply = createMap.apply(names, TC);
        System.out.println("createMap.apply(names,TC) = " +apply );
        Map<String,Integer> entry=new HashMap<>();
        entry.put("Barış",2);
        System.out.println("entry = " + entry.keySet().size());


        System.out.println("dvide.apply(9,2) = " + dvide.apply(9, 2));


    }
}
