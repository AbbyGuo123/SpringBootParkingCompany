package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Model.Order;
import com.oocl.parkingCompany.Model.Receipt;
import com.oocl.parkingCompany.Service.OrderService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    public Order addOrder(Receipt receipt){
        Order order = new Order(1,receipt.getId(),"unRob");
        MemoryDB memoryDB = new MemoryDB();
        memoryDB.getOrderList().add(order);
        return order;
    }
}
