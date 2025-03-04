package LLD.parkinglot.customer;

public class Customer implements ICustoemr {
    private String name;
    private String phoneNum;
    private String email;

    public Customer(String name, String phoneNum, String email){
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmail(){
        return email;
    }
    public void update(String message){
        System.out.println(" mesage recived to customer, :"+getName()+" : "+message);
    }

}
