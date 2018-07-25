package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.ParkingLot;

import java.util.List;

public interface ParkingLotService {
    List<ParkingLot> addParkingLot(ParkingLot parkingLot);
    ParkingLot arrangeParkingBoyInParkingLot(int parkingLotId,int parkingBoyId);
    List<ParkingLot> getfilterParkingLotByStatus(String status);
}
