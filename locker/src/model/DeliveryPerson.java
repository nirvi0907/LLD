package locker.src.model;

import java.lang.System;
import java.util.List;
import java.util.Map;

public class DeliveryPerson implements Observer,IUser{
    private  String name;
    private  int id;
    private int phone;
    private List<Locker> packagesToReturn;
    private List<Locker> packagesToDeliver;


    public DeliveryPerson(String name, int id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    public void update(String msg, Map<String, String> lockerDetails){
        System.out.println(msg+":"+lockerDetails);
    }

    public String getName(){
        return name;
    }
}
