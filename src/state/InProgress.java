package state;

public class InProgress extends AbstractState {

    private Task task;

    public InProgress(Task task) {
        this.task = task;
    }

    @Override
    public void cancel() {
        task.setActualState(new Canceled(task));
    }

    @Override
    public void finish() {
        task.setActualState(new Finished(task));
    }

    @Override
    public void release() {
        task.setActualState(new NotAssigned(task));
    }

    @Override
    public String toString() {
        return "IN_PROGRESS";
    }
}
