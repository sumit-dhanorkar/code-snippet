package intefaces.practice;

public class Main {
    public static void main(String[] args) {
        // Create an instance of System2, which implements the UI interface
        UI system2 = new System2();

        // Create an instance of System1 and pass the UI interface of System2 to it
        System1 system1 = new System1(system2);

        // System1 interacts with System2 through the UI interface
        system1.startSystem(); // This will turn on System2
        system1.stopSystem();  // This will turn off System2
    }
}
