package state;

import util.User;

public class Task {

    private AbstractState actualState;
    private User executiveUser;


    public Task() {
        setActualState(new NotAssigned(this));
    }

    public Task(User user) {
        setExecutiveUser(user);
        setActualState(new Assigned(this));
    }

    public void accept() {
        actualState.accept();
    }

    public void finish() {
        actualState.finish();
    }


    public void setActualState(AbstractState actualState) {
        this.actualState = actualState;
        actualState.setTask(this);
    }

    public void setExecutiveUser(User executiveUser) {
        this.executiveUser = executiveUser;
    }

    public void start() {
        this.actualState.start();
    }

    public User getExecutiveUser() {
        return executiveUser;
    }

    public String getStateMsg() {
        return actualState.toString();
    }


    public void assignUser(User executiveUser) {
        actualState.assignUser(executiveUser);
    }

    public void release() {
        actualState.release();
    }

    public void unassignUser() {
        actualState.unassignUser();
    }

    public void cancel() {
        actualState.cancel();
    }
}
