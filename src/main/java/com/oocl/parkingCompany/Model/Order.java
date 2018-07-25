package com.oocl.parkingCompany.Model;

import java.util.UUID;

public class Order {
    private UUID id;
    private String carId;
    private int parkingBoyId;
    private int parkingLotId;
    private String status;

    public Order(UUID id, String carId, String status) {
        this.id = id;
        this.carId = carId;
        this.status = status;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
