package state;

import util.User;

public abstract class AbstractState {

    private Task task;

    public void assignUser(User executiveUser) {}

    public void accept() {}

    public void release() {}

    public void unassignUser() {}

    public void cancel() {}

    public void start() {}

    public void finish() {}

    public void setTask(Task task) {
        this.task = task;
    }
}
