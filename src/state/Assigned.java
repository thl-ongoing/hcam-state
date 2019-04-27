package state;

public class Assigned extends AbstractState {

    private Task task;

    public Assigned(Task task) {
        this.task = task;
    }

    @Override
    public void accept() {
        task.setActualState(new Accepted(task));
    }

    @Override
    public void unassignUser() {
        task.setExecutiveUser(null);
        task.setActualState(new NotAssigned(task));
    }

    @Override
    public void cancel() {
        task.setActualState(new Canceled(task));
    }

    @Override
    public String toString() {
        return "ASSIGNED";
    }
}
