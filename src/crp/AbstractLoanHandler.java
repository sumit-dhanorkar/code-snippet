package crp;

// Step 2: Create a base abstract class for common logic
abstract class AbstractLoanHandler implements LoanHandler {
    protected AbstractLoanHandler nextHandler;

    public void setNextHandler(AbstractLoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void processNext(LoanApplication application) {
        if (nextHandler != null) {
            nextHandler.process(application);
        }
    }
}
