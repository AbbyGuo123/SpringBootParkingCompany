package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Model.ParkingLot;

import java.util.List;

public interface ParkingBoysService {
    List<ParkingBoy> addparkingBoy(ParkingBoy parkBoy);
    List<ParkingBoy> getAllParkingBoy();
    List<ParkingLot> getParkingBoyAllParkingLot(int parkingBoyId);
    Boolean IsParkingBoyHasAvaliablePark(int parkingBoyId);
}
