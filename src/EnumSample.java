//public enum EnumSample{
//
//    MONDAY(101,"1st day of the week"),
//    TUESDAY(102,"2nd day of the week"),
//    WEDNESDAY(103,"3rd day of the week"),
//    THURSDAY(104,"4th day of the week"),
//    FRIDAY(105,"5th day of the week"),
//    SATURDAY(106,"1st weekOff"),
//    SUNDAY(107,"s2t weekOff");
//
//    private int val;
//    private String comment;
//
//    //as we discuseed that constructer cant be initiated so this will be private
//    //so here below i do not define private it is default but in bytecode it will be private
//
//    /*
//        and as we know that constructor can not be initiated but this private consturucter can
//        be initiated within this class only so here
//        MONDAY(101,"1st day of the week") -> calling constructor by passing first int and then
//        string value and will be assigened to
//        this val and comment variables
//
//     */
//     EnumSample(int val, String comment){
//         this.comment=comment;
//         this.val=val;
//     }
//
//
//     // each constant in construcor will have its own versions of below methods
//     public int getVal(){
//         return val;
//     }
//
//     public  String getComment(){
//         return comment;
//     }
//
//     /*
//       and one thing is that what ever the method we want to keep
//       at class level this is created as static
//     */
//    public static EnumSample getEnumFromValue(int value){
//        for (EnumSample sample:EnumSample.values()){
//            if (sample.val==value){
//                return sample;
//            }
//        }
//        return  null;
//    }
//}
//


//public enum EnumSample{
//
//    MONDAY{
//        @Override
//        public void dummyMethod() {
//            System.out.println("Monday dummy method ");
//        }
//    },
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY;
//
//    public  void dummyMethod(){
//        System.out.println("Default dummy method");
//    }
//
//}

//



public enum EnumSample {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}





