package com.oocl.parkingCompany.Controller;

import com.oocl.parkingCompany.Model.Receipt;
import com.oocl.parkingCompany.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @PostMapping
    public Receipt parkingCar(String CarNo){
        return receiptService.parkingCar(CarNo);
    }

}
