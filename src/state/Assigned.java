package state;

public class Assigned extends AbstractState {

    private Task task;

    public Assigned(Task task) {
        this.task = task;
    }

    @Override
    public void unassignUser() {
        System.out.println("User " + task.getExecutiveUser() + " was unassigned");
        task.setExecutiveUser(null);
        task.setActualState(new NotAssigned(task));
    }

    @Override
    public String toString() {
        return "ASSIGNED";
    }
}
