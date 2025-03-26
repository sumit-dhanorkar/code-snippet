package crp;

class CreditCheckHandler extends AbstractLoanHandler {
    @Override
    public void process(LoanApplication application) {
        if (application.getStage() > 2) {
            System.out.println("Skipping Credit Check");
            processNext(application);
            return;
        }

        System.out.println("Processing Credit Check");
        application.setStage(3);
        processNext(application);
    }
}