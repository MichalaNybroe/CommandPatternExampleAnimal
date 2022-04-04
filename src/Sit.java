public class Sit implements CommandInterface {

    private Animal animal;

    public Sit(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void execute() {
        animal.sit();
    }
}
