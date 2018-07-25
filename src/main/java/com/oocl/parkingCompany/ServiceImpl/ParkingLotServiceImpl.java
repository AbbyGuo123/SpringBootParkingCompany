package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.ParkingLot;
import com.oocl.parkingCompany.Service.ParkingLotService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    MemoryDB memoryDB = new MemoryDB();
    public List<ParkingLot> addParkingLot(ParkingLot parkingLot){
        List<ParkingLot> parkingLotList = memoryDB.getParkingLotList();
        parkingLotList.add(parkingLot);
        return parkingLotList;
    }

    public ParkingLot arrangeParkingBoyInParkingLot(int parkingLotId,int parkingBoyId){
        ParkingLot parkingLot = memoryDB.getParkingLotList().stream().filter(x->x.getId()==parkingLotId).collect(Collectors.toList()).get(0);
        parkingLot.setParkingBoyId(parkingBoyId);
        return parkingLot;
    }

    public List<ParkingLot> getfilterParkingLotIsAvalidate(String status){
        if(status.equals("avaliable"))
            return memoryDB.getParkingLotList().stream().filter(x->x.getAvaliable()>0).collect(Collectors.toList());
        else
            return memoryDB.getParkingLotList().stream().filter(x->x.getAvaliable()==0).collect(Collectors.toList());
    }
}
