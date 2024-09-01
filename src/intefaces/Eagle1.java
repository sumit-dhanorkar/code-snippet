package intefaces;

interface Bird1{
    public void canFly();
    public void noOfLegs();
}

public abstract class Eagle1 implements Bird1 {
    @Override
    public void canFly() {
        //implementation
    }
    public abstract void beakLength();
}


