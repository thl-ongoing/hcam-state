package state;

public class Accepted extends AbstractState {

    private Task task;


    public Accepted(Task task) {
        this.task = task;
    }

    @Override
    public void release() {
        task.setActualState(new NotAssigned(task));
    }

    @Override
    public void start() {
        task.setActualState(new InProgress(task));
    }

    @Override
    public void cancel() {
        task.setActualState(new Canceled(task));
    }

    @Override
    public String toString() {
        return "ACCEPTED";
    }
}
