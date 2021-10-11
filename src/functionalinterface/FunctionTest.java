package functionalinterface;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer,String> integerStringFunction =(t)->t + "";

        String apply = integerStringFunction.apply(5);

        String a=  apply+4;
        System.out.println("a = " + a);


    }
}
