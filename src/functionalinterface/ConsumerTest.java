package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> dublicate = (s) -> {
            System.out.println(s + s);
        };

        dublicate.accept("Barış");

        Consumer<Integer> cube = (i) -> {
            System.out.println(i * i * i);
        };

        cube.accept(3);



    }



}


