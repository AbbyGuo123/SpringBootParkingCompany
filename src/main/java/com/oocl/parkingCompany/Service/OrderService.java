package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.Order;
import com.oocl.parkingCompany.Model.Receipt;

import java.util.List;

public interface OrderService {
    public Order addOrder(Receipt receipt);
    public List<Order> getUnRobOrderList();
    public Order RobOrder(int parkingBoyId);
}
