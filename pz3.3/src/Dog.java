import java.time.LocalDate;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog>{
    public int scaredOfThievesCount; //кількість зляканих злодіїв

    public Dog(String name, LocalDate yearOfBirth, int age, int scaredOfThievesCount) {
        super(name, yearOfBirth, age);
        this.scaredOfThievesCount = scaredOfThievesCount;
        new Random().nextInt(getAge() * getAge() + 1);
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping (U´ᴥ`U)");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! (▼・ᴥ・▼)");
    }

    @Override
    public String toString() {
        return "Dog " + name + " scared of " + scaredOfThievesCount + " thieves";
    }
    @Override
    public int compareTo(Dog animal) {
        return Integer.compare(this.scaredOfThievesCount,animal.scaredOfThievesCount);
    }
}
