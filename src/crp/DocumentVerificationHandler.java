package crp;

// Step 3: Create Concrete Handlers
class DocumentVerificationHandler extends AbstractLoanHandler {
    @Override
    public void process(LoanApplication application) {
        if (application.getStage() > 1) {
            // Skip processing if already passed this stage
            System.out.println("Skipping Document Verification");
            processNext(application);
            return;
        }

        System.out.println("Processing Document Verification");
        application.setStage(2);
        processNext(application);
    }
}
