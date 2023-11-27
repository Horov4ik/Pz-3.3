import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************CAT***************************");
        Cat tom = new Cat("Tom", LocalDate.of(2018, 1, 1), 5, 22);
        Cat murca = new Cat("Murca", LocalDate.of(2017, 1, 1), 6, 6);
        Cat murzic = new Cat("Murzic", LocalDate.of(2013, 1, 1), 10, 61);
        List<Cat> cats = new ArrayList<>(List.of(tom, murca, murzic));
        //Collections.sort(cats);
        cats.sort(Comparator.comparingInt(cat -> cat.caughtMiceCount));
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("**********************DOG***************************");
        Dog shuric = new Dog("Shuric", LocalDate.of(2015, 1, 1), 8, 25);
        Dog zver = new Dog("Zver", LocalDate.of(2021, 1, 1), 2, 3);
        Dog luna = new Dog("Luna", LocalDate.of(2019, 1, 1), 4, 8);
        List<Dog> dogs = new ArrayList<>(List.of(shuric, zver, luna));
        //Collections.sort(dogs);
        dogs.sort(Comparator.comparingInt(dog -> dog.scaredOfThievesCount));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("**********************YEARS************************");
        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));

        for (PatAnimal animal : rancho) {
            System.out.println(animal.getName() + " " + animal.getAge() + " years");
        }
    }
}