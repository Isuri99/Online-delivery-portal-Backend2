package com.example.UserDashboardfirstpage.service;

import com.example.UserDashboardfirstpage.model.Order_status;

import java.util.List;

public interface Order_statusService {
    public Order_status saveOrder_status(Order_status order_status);
    public List<Order_status> getAllOrder_statuses();
}
