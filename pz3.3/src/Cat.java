import java.time.LocalDate;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat> {
    public int caughtMiceCount; //кількість спійманих мишей

    public Cat(String name, LocalDate yearOfBirth, int age, int caughtMiceCount) {
        super(name, yearOfBirth, age);
        this.caughtMiceCount = caughtMiceCount;
        new Random().nextInt(getAge() * getAge() + 1);
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping  (=‐ω‐=)");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! (ฅ•ω•ฅ)");
    }

    @Override
    public String toString() {
        return "Cat " + name + " caught " + caughtMiceCount + " mice";
    }

    @Override
    public int compareTo(Cat animal) {
        return Integer.compare(this.caughtMiceCount, animal.caughtMiceCount);
    }
}
