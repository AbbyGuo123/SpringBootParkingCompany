package com.oocl.parkingCompany.Service;

import com.oocl.parkingCompany.Model.Order;
import com.oocl.parkingCompany.Model.Receipt;

public interface OrderService {
    public Order addOrder(Receipt receipt);
}
