package state;

public class Finished extends AbstractState {

    private Task task;

    public Finished(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "FINISHED";
    }
}
