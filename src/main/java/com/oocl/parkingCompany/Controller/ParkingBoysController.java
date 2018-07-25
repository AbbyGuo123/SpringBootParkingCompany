package com.oocl.parkingCompany.Controller;

import com.oocl.parkingCompany.Model.ParkingBoy;
import com.oocl.parkingCompany.Service.ParkingBoysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoysController {
    @Autowired
    private ParkingBoysService parkingBoysService;

    @PostMapping
    public List<ParkingBoy> addparkingBoy(@RequestBody ParkingBoy parkingBoy){
        List<ParkingBoy> parkingBoyList = parkingBoysService.addparkingBoy(parkingBoy);
        return parkingBoyList;
    }

    @GetMapping
    public List<ParkingBoy> getAllparkingBoy(){
        List<ParkingBoy> parkingBoyList = parkingBoysService.getAllParkingBoy();
        return parkingBoyList;
    }
}
