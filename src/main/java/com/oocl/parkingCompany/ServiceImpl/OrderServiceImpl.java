package com.oocl.parkingCompany.ServiceImpl;

import com.oocl.parkingCompany.Exception.NotHasAvaliableParkException;
import com.oocl.parkingCompany.Exception.NotHaveUnRobOrderException;
import com.oocl.parkingCompany.Model.Order;
import com.oocl.parkingCompany.Model.Receipt;
import com.oocl.parkingCompany.Service.OrderService;
import com.oocl.parkingCompany.Service.ParkingBoysService;
import com.oocl.parkingCompany.memoryDB.MemoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ParkingBoysService parkingBoysService;

    public Order addOrder(Receipt receipt){
        UUID uuid = UUID.randomUUID();
        Order order = new Order(uuid,receipt.getId(),"unRob");
        MemoryDB memoryDB = new MemoryDB();
        memoryDB.getOrderList().add(order);
        return order;
    }

    public List<Order>getUnRobOrderList(){
        MemoryDB memoryDB = new MemoryDB();
        List<Order> unRobOrderList = memoryDB.getOrderList().stream().filter(x->x.getStatus().equals("unRob")).collect(Collectors.toList());
        return unRobOrderList;
    }

    public Order RobOrder(int parkingBoyId){
        Order RobOrder = null;
        if(parkingBoysService.IsParkingBoyHasAvaliablePark(parkingBoyId)) {
            List<Order> unRobOrderList = this.getUnRobOrderList();
            if(unRobOrderList.size()>0){
                RobOrder = unRobOrderList.get(0);
                RobOrder.setParkingBoyId(parkingBoyId);
                int parkingLotId = parkingBoysService.getParkingBoyAllParkingLot(parkingBoyId).stream().filter(x->x.getAvaliable()>0).collect(Collectors.toList()).get(0).getId();
                RobOrder.setParkingLotId(parkingLotId);
                RobOrder.setStatus("Rob");
            }
            else
                throw new NotHaveUnRobOrderException();
        }
        else
            throw new NotHasAvaliableParkException();
        return RobOrder;
    }
}
