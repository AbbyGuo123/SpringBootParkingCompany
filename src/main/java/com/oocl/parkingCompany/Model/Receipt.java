package com.oocl.parkingCompany.Model;

public class Receipt {
    private int id;
    private String CarNo;

    public Receipt(int id, String carNo) {
        CarNo = carNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNo() {
        return CarNo;
    }

    public void setCarNo(String carNo) {
        CarNo = carNo;
    }
}
