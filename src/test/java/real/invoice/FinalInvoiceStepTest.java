package real.invoice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FinalInvoiceStepTest {

    private FinalInvoiceStep finalInvoiceStep = null;
    private Customer customer = null;
    private Invoice invoice = null;
    private PrintService printService = null;
    private EmailService emailService = null;

    @Before
    public void setUp() throws Exception {
        printService = Mockito.mock(PrintService.class);
        emailService = Mockito.mock(EmailService.class);
        customer = new Customer();
        finalInvoiceStep = new FinalInvoiceStep(printService, emailService);
        invoice = new Invoice();

    }

    @Test
    public void testHandleInvoiceWithCustomerEmailTrueThenCheckInteractions() {
        customer.setPrefersEmails(true);
        finalInvoiceStep.handleInvoice(invoice,customer);
        //Nothing should be printed
        Mockito.verifyZeroInteractions(printService);
        //something must be emailsed
        Mockito.verify(emailService).sendInvoice(invoice, customer.getEmail());
    }

    @Test
    public void testHandleInvoiceWithCustomerEmailFalseThenCkeckInteractions() {
        customer.setPrefersEmails(false);
        finalInvoiceStep.handleInvoice(invoice,customer);
        //Nothing should be emailed
        Mockito.verifyZeroInteractions(emailService);
        //The invoice must be printed
        Mockito.verify(printService).printInvoice(invoice);



    }
}