package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Service.ParkingBoysService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingBoysServiceImpl implements ParkingBoysService {
    public List<ParkingBoy> addparkingBoy(ParkingBoy parkBoy) {
        MemoryDB memoryDB = new MemoryDB();
        List<ParkingBoy> parkingBoyList = memoryDB.getParkingBoyList();
        parkingBoyList.add(parkBoy);
        memoryDB.setParkingBoyList(parkingBoyList);
        return parkingBoyList;
    }
}
