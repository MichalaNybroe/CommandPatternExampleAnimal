public class MakeSound implements CommandInterface{

    private Animal animal;

    public MakeSound(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void execute() {
        animal.makeSound();
    }
}
