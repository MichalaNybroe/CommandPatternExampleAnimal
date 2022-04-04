import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog("Adam", 3);
        Cat cat = new Cat("Sofus", 5);
        TV tv = new TV();


        while (true) {
            CommandInterface[] commands = {
                    new MakeSound(dog),
                    new Sit(dog),
                    new TurnOn(tv)

            };

            int input = scanner.nextInt();
            scanner.nextLine();

            Owner jens = new Owner(commands[input]);

            jens.action();

        }
    }
}
