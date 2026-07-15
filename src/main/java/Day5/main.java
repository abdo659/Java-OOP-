package Day5;

public class main {
    public static void main(String[] args) {

        // Polymorphism using parent reference
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        // calling same method, different behavior
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}