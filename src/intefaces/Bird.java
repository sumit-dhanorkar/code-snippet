package intefaces;

////outer interface
//public interface Bird  {
//
//
//}


interface LivingThings{
    default boolean canBreath(){
        return true;
    }
}

public interface Bird {

    void canFly(); //equalent to pubic abastract void canFly();

    public default void minimunFlyingHeight(){
        myStaticPublicMethod(); //calling static method
        myPrivateMethod(); //calling private method
        myPrivateStaticMethod(); //calling private static method
    }

    static void myStaticPublicMethod(){
        //form static we can call other static method only
        myPrivateStaticMethod();
    }

    private void myPrivateMethod(){
        //private method implementation
    }

    private static  void myPrivateStaticMethod(){
        // private static method implementation
    }

}
