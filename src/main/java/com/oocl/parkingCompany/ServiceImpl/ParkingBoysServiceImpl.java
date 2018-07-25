package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Model.ParkingLot;
import com.oocl.parkingCompany.Service.ParkingBoysService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingBoysServiceImpl implements ParkingBoysService {
    public List<ParkingBoy> addparkingBoy(ParkingBoy parkBoy) {
        MemoryDB memoryDB = new MemoryDB();
        List<ParkingBoy> parkingBoyList = memoryDB.getParkingBoyList();
        parkingBoyList.add(parkBoy);
        return parkingBoyList;
    }
    public List<ParkingBoy> getAllParkingBoy(){
        MemoryDB memoryDB = new MemoryDB();
        List<ParkingBoy> parkingBoyList = memoryDB.getParkingBoyList();
        return parkingBoyList;
    }
    public List<ParkingLot> getParkingBoyAllParkingLot(int parkingBoyId){
        MemoryDB memoryDB = new MemoryDB();
        return memoryDB.getParkingLotList().stream().filter(x->x.getParkingBoyId()==parkingBoyId).collect(Collectors.toList());
    }

    public Boolean IsParkingBoyHasAvaliablePark(int parkingBoyId){
        MemoryDB memoryDB = new MemoryDB();
        int avaliableSize = memoryDB.getParkingLotList().stream().filter(x->x.getParkingBoyId()==parkingBoyId&&x.getAvaliable()>0).collect(Collectors.toList()).size();
        return avaliableSize>0;
    }
}
