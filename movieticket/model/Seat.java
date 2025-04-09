package movieticket.model;

public class Seat {
    private SeatStatus status;
    private SeatType type;
    private String num;
    private int price;

    public Seat(String num, int price, SeatStatus status, SeatType type) {
        this.status = status;
        this.price = price;
        this.type = type;
        this.num = num;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }

    public String getNum() {
        return num;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}
