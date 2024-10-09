package exception;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            method("dummy");
            return ;
        }catch (MyCustomException e){
            //handle it
        }
    }
    public static void method(String name)  throws MyCustomException {
        throw new MyCustomException("There is some exception");
    }
}


