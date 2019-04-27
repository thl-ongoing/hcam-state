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
        System.out.println("User " + task.getExecutiveUser() + " was assigned");
    }

    @Override
    public String toString() {
        return "NOT_ASSIGNED";
    }
}
