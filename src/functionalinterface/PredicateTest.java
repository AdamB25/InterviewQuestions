package functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> isEven=(t)->{
            if (t%2==0){
                return true;
            }

            else{
                return false;
            }

        };

        System.out.println("isEven.test(9) = " + isEven.test(9));

        Predicate<Integer> isOdd= s ->  s%2!=0 ? true : false;

        System.out.println("isOdd.test(5) = " + isOdd.test(5));


    }


}
