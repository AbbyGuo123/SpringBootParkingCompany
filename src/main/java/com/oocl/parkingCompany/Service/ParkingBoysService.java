package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.ParkingBoy;

import java.util.List;

public interface ParkingBoysService {
    public List<ParkingBoy> addparkingBoy(ParkingBoy parkBoy);
    public List<ParkingBoy> getAllParkingBoy();
}
