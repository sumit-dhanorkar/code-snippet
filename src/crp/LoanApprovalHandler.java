package crp;

class LoanApprovalHandler extends AbstractLoanHandler {
    @Override
    public void process(LoanApplication application) {
        if (application.getStage() > 3) {
            System.out.println("Skipping Loan Approval");
            processNext(application);
            return;
        }

        System.out.println("Processing Loan Approval");
        application.setStage(4);
        processNext(application);
    }
}