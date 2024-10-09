package reflection;

import intefaces.Eagle;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> dbInstanceClass = DBInstance.class;
        //to private constructor too
        Constructor<?>[] DbConstructorsList = dbInstanceClass.getDeclaredConstructors();
        for (Constructor<?> constructor : DbConstructorsList) {
            System.out.println("Modified constructor: " + Modifier.toString(constructor.getModifiers()));
            constructor.setAccessible(true);
            DBInstance dbInstance=(DBInstance) constructor.newInstance();
            dbInstance.getInstance();
        }
    } 
}

/*
   OUTPUT:
    Modified constructor: private
    private dbInstance
*/

