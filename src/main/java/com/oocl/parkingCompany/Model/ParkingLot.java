package com.oocl.parkingCompany.Model;

public class ParkingLot {
    private int id;
    private int totals;
    private int avaliable;
    private int parkingBoyId;

    public ParkingLot(int id, int totals, int avaliable, int parkingBoyId) {
        this.id = id;
        this.totals = totals;
        this.avaliable = avaliable;
        this.parkingBoyId = parkingBoyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public int getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(int avaliable) {
        this.avaliable = avaliable;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }
}
