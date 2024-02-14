package Functional_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mainsome {
    public static int SumCalculator(int a, int b) {
        return a + b;
    }



    public static void main(String[] args) {
        System.out.println("Opdracht 1:");
        //1. Function for deviding by 3. In <a, b>, a is input type and b is return type
        Function<Integer, Double> function = t -> t / 3.0;
        double answer = function.apply(12);
        System.out.println(answer);

        //___________________________________________________________________________________
        System.out.println("\n Opdracht 2:");
        //2. This function creates a list of Functional_Interfaces.Customer objects, extracts their IDs using the getId method, and collects these IDs into a new list of integers.

        Customer customer1 = new Customer("Jan", 9);
        Customer customer2 = new Customer("Lora", 5369);

        final List<Customer> customerList = new ArrayList<>();

        customerList.add(customer1);
        customerList.add(customer2);

        List<Integer> ids = customerList.stream()
                .map(Customer:: getId)
                //mag ook zeggen: customer -> customer.getId()
                .collect(Collectors.toList());

        System.out.println(ids);

        //____________________________________________________________________
        System.out.println("\n Opdracht 3:");
        //3. Functions with .andThen

        Function<Double, Double> divideFunction = t -> t / 3;
        Function<Double, Double> subtractFunction = t -> t - 2.0;
        Double answer2 = divideFunction.andThen(subtractFunction).apply(12.0);
        System.out.println(answer2);
        //Je kan experimenteren met verschillende types, zoals integer en double mixen.

        //____________________________________________________________________
        System.out.println("\n Opdracht 4:");
        //4. Functions with .compose: omgekeerde van andThen. Doet eerst deel tussen haakjes, daarna pas het deel voor .compose

        Double answer3 = divideFunction.compose(subtractFunction).apply(14.0);
        System.out.println(answer3);

        //____________________________________________________________________
        System.out.println("\n Opdracht 5:");
        //5. takes type and makes it another type
        IntToDoubleFunction divideFunction2 = t -> t / 3.0;
        Double answer4 = divideFunction2.applyAsDouble(12);
        System.out.println(answer4);

        //____________________________________________________________________
        System.out.println("\n Opdracht 6:");
        // 6. Takes in two types and returns one type
        BiFunction<Integer, Integer, Double> testingThis = (t, u) -> t + u / 2.0;
        Double answer5 = testingThis.apply(2, 4);
        System.out.println(answer5);

        //____________________________________________________________________
        System.out.println("\n Opdracht 7:");
        // 7. Takes in two types and returns one type
        ToDoubleBiFunction<Integer, Integer> testingThat = (t, u) -> t + u / 2.0;
        Double answer6 = testingThat.applyAsDouble(2, 4);
        System.out.println(answer6);

        //____________________________________________________________________
        System.out.println("\n Opdracht 8:");
        // 8. takes in parameter and gives back boolean
        Predicate<String> predicate = t -> t.startsWith("Geek");
        boolean answer7 = predicate.test("Geekific");
        System.out.println(answer7);

        //____________________________________________________________________
        System.out.println("\n Opdracht 8a:");
//        // 8a.
        List<Customer> filteredCustomers = customerList.stream()
                .filter(customer -> customer.getId() < 20)
                .collect(Collectors.toList());
        System.out.println(filteredCustomers);


        //____________________________________________________________________
        System.out.println("\n Opdracht 9:");
        // 9.  two ways to work with predicate, which gives the same result. Also used by not and !
        Predicate<String> predicate1 = t -> t.startsWith("Geek") && t.length() == 8;
        boolean answer8 = predicate1.test("Geekific");
        System.out.println("deel 1: " + answer8);

        Predicate<String> predicate2 = t -> t.startsWith("Geek");
        Predicate<String> predicate3 = t -> t.length() == 8;
        boolean answer9 = predicate2.and(predicate3).test("Geekific");
        System.out.println("deel 2: " + answer9 + "  dit zou hetzelfde moeten zijn");

//____________________________________________________________________
        System.out.println("\n Opdracht 10:");
        // 10.  gives a random number, in selected type, without any input
        Supplier<Double> supplier = Math :: random;
        double answer10 = supplier.get();
        System.out.println(answer10);

        //____________________________________________________________________
        System.out.println("\n Opdracht 11:");
        // 11.  Generates a stream, which prints a statement for an x amount of time
        Stream.generate(() -> "Geekific")
                .limit(10)
                .forEach(System.out::println);

        //____________________________________________________________________
        System.out.println("\n Opdracht 12:");
        // 12. Generates list with 10 random numbers
        List<Double> tenRandomNumbers = Stream.generate(supplier)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(tenRandomNumbers);

        //____________________________________________________________________
        System.out.println("\n Opdracht 13:");
        // 13. prints input
        Consumer<String> consumer = System.out::println;
        consumer.accept("Geekific");

        //____________________________________________________________________
        System.out.println("\n Opdracht 14:");
        // 14. puts input from accept first, than c1, than input from accept agin, than c2
        Consumer<String> c1 = s1 -> System.out.println(s1 + "Consumer 1 | ");
        Consumer<String> c2 = s2 -> System.out.println(s2 + "Consumer 2 | ");
        c1.andThen(c2).accept("Geekific | ");

        //____________________________________________________________________
        System.out.println("\n Opdracht 15:");
        // 15. change all items in a list at once
        List<String> list = Arrays.asList("GEEKIFIC", "OPERATORS");
        System.out.println("Orginele lijst: " + list);
        list.replaceAll(String::toLowerCase);
        System.out.println("Aangepaste lijst: " + list);

        //____________________________________________________________________
        System.out.println("\n Opdracht 16:");
        // 16. takes all values of stream. Takes first parameter of .reduce, and adds all values.
        Integer sum = Stream.of(20, 10, -40, 80, 30)
                .reduce(25, (a, b) -> a + b);
        System.out.println(sum);








        //gebleven bij 8.17 van functional Interfaces and lambda expressions by geekific

    }


}
