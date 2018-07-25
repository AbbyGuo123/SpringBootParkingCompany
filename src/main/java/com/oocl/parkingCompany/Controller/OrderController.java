package com.oocl.parkingCompany.Controller;

import com.oocl.parkingCompany.Model.Order;
import com.oocl.parkingCompany.Service.OrderService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping
    public Order RobOrder(int parkingBoyId){
        Order order = orderService.RobOrder(parkingBoyId);
        return order;
    }
    @GetMapping("/unRob")
    public List<Order> getUnRobOrderList(){
        return orderService.getUnRobOrderList();
    }
    @GetMapping
    public List<Order> getAllOrderList(){
        MemoryDB memoryDB = new MemoryDB();
        return memoryDB.getOrderList();
    }

}
