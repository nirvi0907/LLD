package movieticket.model;

public class Payment {
    private int price;
    private PaymentMode mode;
    public Payment(PaymentMode mode, int price) {
        this.price = price;
        this.mode = mode;
    }

    public int getPrice(){
        return price;
    }
}
