public class Main {
    public static void main(String[] args) {
        isWeekend(2);//return false
        isWeekend(6);//return true
        isWeekend(100); //this value is not expected, but still we are able to send this
        //parameter we dont have control on value we are passing

        /*
            in below, we have better readability that what we are passing,
            and we have full control on that.
             we can pass only here enumSample variable
         */
        isWeekend(EnumSample.MONDAY); //return false;
        isWeekend(EnumSample.SUNDAY); //return true;
    }

    public static  boolean isWeekend(int day){
        if (WeekConstant.SATURDAY==day || WeekConstant.SUNDAY==day){
            return true;
        }
        return false;
    }


    public  static  boolean isWeekend(EnumSample day){

        if (EnumSample.SATURDAY ==day || EnumSample.SUNDAY==day){
              return  true;
        }

        return false;
    }
}

//public final class TestClass{
//
//}
//
//public class MyOtherClass extends  TestClass{
//
//}