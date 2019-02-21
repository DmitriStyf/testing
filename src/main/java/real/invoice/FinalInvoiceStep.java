package real.invoice;

public class FinalInvoiceStep {

    private PrintService printService = null;
    private EmailService emailService = null;

    public FinalInvoiceStep(PrintService printService, EmailService emailService) {
        this.printService = printService;
        this.emailService = emailService;
    }

    public void handleInvoice (Invoice invoice, Customer customer){
        if (customer.isPrefersEmails()){
            emailService.sendInvoice(invoice, customer.getEmail());
        } else {
            printService.printInvoice(invoice);
        }
    }
}
