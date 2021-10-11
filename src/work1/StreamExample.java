package work1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        streamFilter();
       // skipStream();

    }

    private static void skipStream() {
        Stream<String> onceModifiedStream =
                Stream.of("abcd", "bbcd", "cbcd").skip(2);
        System.out.println("onceModifiedStream.findFirst() = " + onceModifiedStream.findFirst());

    }

    private static void streamFilter() {

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b")||element.contains("a"))
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();
        System.out.println("anyElement = " + anyElement);
        System.out.println("firstElement = " + firstElement);

    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
