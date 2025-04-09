package movieticket.providers;

import movieticket.model.Payment;

public class PaymentParty {
    private Payment payment;

    public PaymentParty(Payment payment) {
        this.payment = payment;
    }

    public void book(){
        //connect with 3rd party
    }
}
