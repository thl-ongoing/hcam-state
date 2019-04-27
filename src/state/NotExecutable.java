package state;

public class NotExecutable extends AbstractState {

    private Task task;

    public NotExecutable(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "NO_EXECUTABLE";
    }
}
