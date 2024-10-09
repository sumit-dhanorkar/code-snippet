package intefaces;

////outer interface
//public interface Bird  {
//
//
//}


    @FunctionalInterface
    interface LivingThings{
        public boolean canBreath();
    }

//    @FunctionalInterface
    public interface Bird  {
        public void canFly();
    }

interface TestInterface{
    String toString();
}


class TestClassImplements implements TestInterface{
}