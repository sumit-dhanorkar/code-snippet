package datatype;

public class VariableExample {

    // Class variable (static field)
    static int classVar = 30;

    // Instance variable (non-static field)
    int instanceVar = 20;

    // Constant (static final field)
    static final int CLASS_CONSTANT = 40;
    final int instanceConstant = 50;

    public static void main(String[] args) {
        // Local variable
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);

        // Accessing class variable
        System.out.println("Class Variable: " + classVar);

        // Creating an instance of the class to access instance variables
        VariableExample example = new VariableExample();
        System.out.println("Instance Variable: " + example.instanceVar);

        // Accessing constants
        System.out.println("Class Constant: " + CLASS_CONSTANT);
        System.out.println("Instance Constant: " + example.instanceConstant);

        // Passing a parameter to a method
        example.methodWithParameter(localVar);
    }

    // Method with a parameter
    public void methodWithParameter(int param) {
        System.out.println("Parameter: " + param);
    }
}



