package com.oocl.parkingCompany.memoryDB;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Model.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryDB {
    private List<ParkingBoy> parkingBoyList = new ArrayList<>();
    private List<ParkingLot> parkingLotList = new ArrayList<>();
    public MemoryDB() {
        this.parkingBoyList.add(new ParkingBoy(1,"1"));
        this.parkingBoyList.add(new ParkingBoy(2,"2"));

        this.parkingLotList.add(new ParkingLot(1,1,1,1));
        this.parkingLotList.add(new ParkingLot(2,2,2,2));
    }

    public List<ParkingBoy> getParkingBoyList() {
        return parkingBoyList;
    }

    public void setParkingBoyList(List<ParkingBoy> parkingBoyList) {
        this.parkingBoyList = parkingBoyList;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}
