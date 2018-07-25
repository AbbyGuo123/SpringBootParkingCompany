package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.ParkingLot;

import java.util.List;

public interface ParkingLotService {
    public List<ParkingLot> addParkingLot(ParkingLot parkingLot);
    public ParkingLot arrangeParkingBoyInParkingLot(int parkingLotId,int parkingBoyId);
    public List<ParkingLot> getfilterParkingLotIsAvalidate(String status);
}
