package crp;

// Step 5: Build and execute the chain
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Creating handlers
        DocumentVerificationHandler docHandler = new DocumentVerificationHandler();
        CreditCheckHandler creditHandler = new CreditCheckHandler();
        LoanApprovalHandler approvalHandler = new LoanApprovalHandler();

        // Setting up the chain
        docHandler.setNextHandler(creditHandler);
        creditHandler.setNextHandler(approvalHandler);

        // Example Case 1: New Application (Starts from Stage 1)
        System.out.println("Processing New Loan Application:");
        LoanApplication newLoan = new LoanApplication(1);
        docHandler.process(newLoan);

        // Example Case 2: Application Resuming from Credit Check (Stage 2 completed)
        System.out.println("\nResuming Loan Application from Credit Check:");
        LoanApplication resumedLoan = new LoanApplication(2);
        docHandler.process(resumedLoan);
    }
}
