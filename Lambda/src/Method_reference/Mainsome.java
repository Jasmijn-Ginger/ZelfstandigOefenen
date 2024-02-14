package Method_reference;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Mainsome {

    public static void main(String[] args) {
        //____________________________________________________________________
        System.out.println("\n Opdracht 1:");
        // 1. Takes in a list of fruits. Converts it into stream. Changes to uppercase. Prints each item.
        List<String> fruits =
                Arrays.asList("Apple", "Banana", "guava", "grapes");


        fruits.stream()
                .map(s -> s.toUpperCase())
                .forEach(fruit -> System.out.println(fruit));


        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //both statements give the same output

        //____________________________________________________________________
        System.out.println("\n Opdracht 2:");
        // 2. makes it alphabetical

        fruits.sort(String::compareToIgnoreCase);
        fruits.forEach(System.out::println);

        //____________________________________________________________________
        System.out.println("\n Opdracht 3:");
        // 3. sorts list

        List<Integer> numbers =
                Arrays.asList(11, 4, 2, 8, 9, 10, 32, 22, 20, 17);

        numbers.stream()
                // .sorted((a, b) -> a.compareTo(b)) lambda way
                .sorted(Integer::compareTo)
                .forEach(s -> System.out.print(s + " "));


        //____________________________________________________________________
        System.out.println("\n Opdracht 4:");
        // 4. builds string with consumer functional interface

        StringBuilder sb = new StringBuilder();

        Consumer<String> consumer = sb::append;

        consumer.accept("Hello");
        consumer.accept(", ");
        consumer.accept("World!");

        System.out.println(sb);




    }
}
