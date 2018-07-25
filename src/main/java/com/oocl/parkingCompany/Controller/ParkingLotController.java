package com.oocl.parkingCompany.Controller;

import com.oocl.parkingCompany.Model.ParkingLot;
import com.oocl.parkingCompany.Service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("")
    public List<ParkingLot> addParkingLot(@RequestBody ParkingLot parkingLot){
        return parkingLotService.addParkingLot(parkingLot);
    }

    @PutMapping("")
    public ParkingLot arrangeParkingBoyInParkingLot(int parkingLotId,int parkingBoyId){
       return parkingLotService.arrangeParkingBoyInParkingLot(parkingLotId,parkingBoyId);
    }

    @GetMapping("")
    public List<ParkingLot> getfilterParkingLotIsAvalidate(String status){
        return parkingLotService.getfilterParkingLotIsAvalidate(status);
    }

}
