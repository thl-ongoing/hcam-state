package state;

public class Canceled extends AbstractState {

    private Task task;

    public Canceled(Task task) {
        this.task = task;
    }


    @Override
    public String toString() {
        return "CANCELED";
    }
}
