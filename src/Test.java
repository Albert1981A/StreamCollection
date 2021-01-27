import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(11, "Yaakov", 31, 15.5),
                new Person(22, "Yoav", 28, 12.2),
                new Person(33, "Shaked", 25, 4.9),
                new Person(44, "Kobi", 31, 30.3),
                new Person(55, "Einat", 53, 41.7));

        // Step 1: Print all
        System.out.println("------------------------------- Print all ---------------------------------");
        people.forEach(System.out::println);
        System.out.println();

        // Step 2: Print All sort by age
        System.out.println("-------------------------- Print All sort by age --------------------------");
        people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList())/* collect is not necessary */.forEach(System.out::println);
        System.out.println();

        // Step 3: Print all start with "Y"
        System.out.println("------------------------ Print all start with \"Y\" --------------------------");
        people.stream().filter(person -> person.getName().startsWith("Y")).collect(Collectors.toList())/* collect is not necessary */.forEach(System.out::println);
        System.out.println();

        // Step 4: Print all - name AND age
        System.out.println("--------------------------- Print Name and Age -----------------------------");
        people.forEach(person -> System.out.println("Persons Name: " + person.getName() + " - Persons Age: " + person.getAge()));
        System.out.println();

        // Step 5: Find the oldest Person
        System.out.println("----------------------- Print the oldest Person by -------------------------");
        System.out.println(people.stream().max(Comparator.comparingInt(Person::getAge)));
        System.out.println();

        // Step 6: Find the youngest Person
        System.out.println("------------------------ Print the youngest Person -------------------------");
        System.out.println(people.stream().min(Comparator.comparingInt(Person::getAge)));
        System.out.println();

        // Step 7: Find all people who are 25 years old
        System.out.println("------------------------- Print All 25 Years old ---------------------------");
        people.stream().filter(person -> person.getAge() == 25).forEach(System.out::println);
        System.out.println();

    }
}


