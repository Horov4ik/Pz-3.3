import java.time.LocalDate;

public abstract class PatAnimal{
    public String name;
    public LocalDate yearOfBirth;
    public int age;

    public PatAnimal(String name, LocalDate yearOfBirth, int age) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public abstract void sleep();
    public abstract void makeSound();
}
