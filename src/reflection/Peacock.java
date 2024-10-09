package reflection;

public class Peacock {
    public String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("Fly");
    }

    private void eat(){
        System.out.println("Eat");
    }

    @Override
    public String toString() {
        return "Peacock{" +
                "breed='" + breed + '\'' +
                ", canSwim=" + canSwim +
                '}';
    }
}

