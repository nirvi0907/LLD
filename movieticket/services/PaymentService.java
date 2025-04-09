package movieticket.services;

import movieticket.model.Payment;
import movieticket.model.PaymentMode;
import movieticket.model.Seat;
import movieticket.model.Show;
import movieticket.providers.PaymentParty;

import java.util.List;

public class PaymentService {

    public boolean processPayment(Show show, List<Seat> seats, PaymentMode mode){
        int totalPrice = 0;
        for(Seat seat:seats){
            totalPrice+=seat.getPrice();

        }
        Payment payment = new Payment(mode, totalPrice);

        PaymentParty thirdPartyPaymentProvider = new PaymentParty(payment);
        thirdPartyPaymentProvider.book();
        return true;
//        Notifier notifier = new Notifier();
//        notifier.notify(show, seats);
    }
}
