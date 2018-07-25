package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.Receipt;
import com.oocl.parkingCompany.Service.OrderService;
import com.oocl.parkingCompany.Service.ParkingLotService;
import com.oocl.parkingCompany.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ParkingLotService parkingLotService;
    @Autowired
    private OrderService orderService;
    public Receipt parkingCar(String CarNo){
        if(parkingLotService.getfilterParkingLotIsAvalidate("avaliable").size()>0) {
            Receipt receipt = new Receipt(1,CarNo);
            orderService.addOrder(receipt);
            return receipt;
        }
        else
            return null;
    }


}
