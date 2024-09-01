package intefaces.practice;

class System1 {

    private UI ui;

    public System1(UI ui) {
        this.ui = ui;
    }

    public void startSystem() {
        System.out.println("System1 is starting System2 via UI interface");
        ui.on();
    }

    public void stopSystem() {
        System.out.println("System1 is stopping System2 via UI interface");
        ui.off();
    }
}
