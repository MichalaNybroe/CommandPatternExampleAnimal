public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaw");
    }

    @Override
    public void sit() {
        System.out.println(this.getName() + " looks at you in disbelief over your stupidity");
    }
}
