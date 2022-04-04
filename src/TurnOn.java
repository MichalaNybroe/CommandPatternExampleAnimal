public class TurnOn implements CommandInterface{
    private TV tv;

    public TurnOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
