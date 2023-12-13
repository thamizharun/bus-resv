package com.example.demo;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity; //get and set
    private String fr1;
    private String t1;
    private int price;
    Bus(int no,boolean ac,int cap,String fr1,String t1,int price){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
        this.fr1=fr1;
        this.t1=t1;
        this.price=price;

    }

    public int getBusNo(){ //accessors
        return busNo;
    }

    public boolean isAc(){
        return ac;
    }
    public int getCapacity(){ //accessor method
        return capacity;
    }
    public String getFr1(){return fr1;}
    public String getT1(){return t1;}
    public int getPrice(){ //accessors
        return price;
    }

    public void setAc(boolean val) { //mutators
        ac = val;
    }

    public void setCapacity(int cap) { //mutator
        capacity = cap;
    }

    public void getfrom(String fr1){
        fr1=fr1;
    }
    public void getto(String t1){
        t1=t1;
    }
    public void setPrice(int price) { //mutator
        price = price;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:" + busNo + " Ac:" + ac + " Total Capacity: " + capacity);
    }
}
