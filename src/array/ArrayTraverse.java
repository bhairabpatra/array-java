package array;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayTraverse {

    String[] employee = new String[10];

    private String name = employee[0];

    public void getArrayValue() {
        System.out.println(String.valueOf(1) + String.valueOf(5));
    }

    public void getArrayValue(String name) {
        System.out.println("Employee name - " + name);
    }

    public void getEmployeeName(String[] employeeName) {
        //we can traverse an array in three ays
        // for loop, foreach & streams
        System.out.println("********************************* approach - 1 \n");
        for (int i = 0; i < employeeName.length; i++)
            System.out.println(employeeName[i]);
        System.out.println("********************************* approach - 2 \n");

        for (String names : employeeName) {
            System.out.println("Name of employee : - " + names);
        }

        System.out.println("********************************* approach - 3 \n");

        Stream.of(employeeName).forEach((name) -> System.out.println("Name of employee using stream : -" + name));

        System.out.println("********************************* approach - 4 \n");

        Stream<Object> names = Stream.of(employeeName).map((name) -> name.toLowerCase());
//      Stream.of(employeeName).map((name)-> name.toLowerCase()).collect(Collectors.toList())
        System.out.println(names.collect(Collectors.toList()));

    }


}
