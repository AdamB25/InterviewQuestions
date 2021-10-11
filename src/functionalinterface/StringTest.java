package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StringTest {
    public static void main(String[] args) {

        //()->{};
         //merge two string
                                       //we don't need
        StringInterface merge=(f,s)->{return f+s;};
        String mergedStrings = merge.function("Selim", "abbas");
        System.out.println( mergedStrings);

        String mergeString = merge.function("Barış", "Altun");
        System.out.println("mergeString = " + mergeString);
       //find the word which has maximum length
        StringInterface findMaxLength=(f,s)->{return (f.length()>s.length()) ? f : s;};
        String maxString = findMaxLength.function("barış", "asi");
        System.out.println("maxString = " + maxString);

        List<String> words=new ArrayList<>();
        words.add("Java");
        words.add("Java");
        words.add("Python");
        words.add("Cydo");
        words.add("Wooden Studio");
        words.add("Wooden Studio");
        Predicate<String> isUnique= p->Collections.frequency(words,p)==1;

        words.forEach(p->{
            if (isUnique.test(p))
            {
                System.out.println("p = " + p);
            }

        });
    }
}
