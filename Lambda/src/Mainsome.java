import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

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
        //2. This function creates a list of Customer objects, extracts their IDs using the getId method, and collects these IDs into a new list of integers.

        Customer customer1 = new Customer("Jan", 9547);
        Customer customer2 = new Customer("Lora", 5369);

        final List<Customer> customerList = new ArrayList<>();

        customerList.add(customer1);
        customerList.add(customer2);

        List<Integer> ids = customerList.stream()
                .map(Customer :: getId)
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
        System.out.println("\n Opdracht 8:");
        // 8.
//        List<Customer> filteredCustomers = customerList.stream()
//                .filter((Customer :: getId) < 20)
//                .
        //gebleven bij 8.17 van functional Interfaces and lambda expressions by geekific

    }

}
