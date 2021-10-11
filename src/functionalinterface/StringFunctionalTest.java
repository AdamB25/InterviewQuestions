package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringFunctionalTest {
    public static void main(String[] args) {
        List<String > names=new ArrayList<>(Arrays.asList("Barış","Erhan","Ali"));

Consumer<List<String>> returnFirsChOfList=(p)->{
    for (String s : p) {
        System.out.println("s.charAt(0) = " + s.charAt(0));
    }
};
returnFirsChOfList.accept(names);

List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

Consumer<List<Integer>> writeOddNumbers= (l)->{
    for (Integer integer : l) {
        if (integer%2==1){
            System.out.println("integer = " + integer);
        }
    }
};
writeOddNumbers.accept(numbers);



List<Integer> numbers1=new ArrayList<>(Arrays.asList(10,21,32,43,55,67,71,83,90));
writeOddNumbers.accept(numbers1);



/*
List<WebElement> list=driver.findElements();

list.foreach(p->p.click());

list.foreach


 */



        // (p)->{};
     Consumer<String> returnFirstCharecter= (p)->{System.out.println("p.charAt() = " + p.charAt(0));};

     returnFirstCharecter.accept("Barış");



    }
}
