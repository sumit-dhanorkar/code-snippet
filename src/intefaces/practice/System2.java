package intefaces.practice;

class System2 implements UI {

    @Override
    public void on() {
        System.out.println("System2 is now ON");
    }

    @Override
    public void off() {
        System.out.println("System2 is now OFF");
    }
    
    // System2 might have other internal methods and details
    private void internalOperation() {
        System.out.println("System2 is performing an internal operation");
    }
}
