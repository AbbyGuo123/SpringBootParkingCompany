package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.Receipt;
import com.oocl.parkingCompany.Service.OrderService;
import com.oocl.parkingCompany.Service.ParkingLotService;
import com.oocl.parkingCompany.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ParkingLotService parkingLotService;
    @Autowired
    private OrderService orderService;
    public Receipt parkingCar(String CarNo){
        if(parkingLotService.getfilterParkingLotByStatus("avaliable").size()>0) {
            UUID uuid = UUID.randomUUID();
            Receipt receipt = new Receipt(uuid,CarNo);
            orderService.addOrder(CarNo);
            return receipt;
        }
        else
            return null;
    }


}
