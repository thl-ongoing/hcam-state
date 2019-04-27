package state;

import util.User;

public class StateMain {

    public static void main(String[] args) {

        Task sampleTask1 = new Task();  // Task without user
        Task sampleTask2 = new Task(new User("Musterfrau")); // Task with user

        System.out.println(sampleTask1.getStateMsg());
        System.out.println(sampleTask2.getStateMsg());

        sampleTask1.assignUser(new User("Mustermann"));
        sampleTask2.unassignUser();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("sampleTask1 State = " + sampleTask1.getStateMsg());
        System.out.println("sampleTask2 State = " + sampleTask2.getStateMsg());

        sampleTask2.assignUser(new User("Mustermann"));
        sampleTask1.unassignUser();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("sampleTask1 State = " + sampleTask1.getStateMsg());
        System.out.println("sampleTask2 State = " + sampleTask2.getStateMsg());

        sampleTask1.accept();
        sampleTask2.accept();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("sampleTask1 State = " + sampleTask1.getStateMsg());
        System.out.println("sampleTask2 State = " + sampleTask2.getStateMsg());

        sampleTask1.start();
        sampleTask2.start();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("sampleTask1 State = " + sampleTask1.getStateMsg());
        System.out.println("sampleTask2 State = " + sampleTask2.getStateMsg());

        sampleTask1.finish();
        sampleTask2.finish();

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("sampleTask1 State = " + sampleTask1.getStateMsg());
        System.out.println("sampleTask2 State = " + sampleTask2.getStateMsg());
    }
}
