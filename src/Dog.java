public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Vuf vuf vuf");
    }

    @Override
    public void sit() {
        System.out.println(this.getName() + " sits and looks at you expectantly");
    }
}
