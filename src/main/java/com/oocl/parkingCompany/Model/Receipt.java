package com.oocl.parkingCompany.Model;

import java.util.UUID;

public class Receipt {
    private UUID id;
    private String CarNo;

    public Receipt(UUID id, String carNo) {
        this.id = id;
        CarNo = carNo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCarNo() {
        return CarNo;
    }

    public void setCarNo(String carNo) {
        CarNo = carNo;
    }
}
