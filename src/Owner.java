public class Owner {

    private CommandInterface commandInterface;

    public Owner(CommandInterface commandInterface) {
        this.commandInterface = commandInterface;
    }

    public void action() {
        commandInterface.execute();
    }
}
