package state;

import util.User;

public class NotAssigned extends AbstractState {

    private Task task;

    public NotAssigned(Task task) {
        this.task = task;
    }

    @Override
    public void assignUser(User executiveUser) {
        task.setExecutiveUser(executiveUser);
        task.setActualState(new Assigned(task));
    }

    @Override
    public void accept() {
        task.setActualState(new Accepted(task));
    }

    @Override
    public void cancel() {
        task.setActualState(new Canceled(task));
    }

    @Override
    public String toString() {
        return "NOT_ASSIGNED";
    }
}
