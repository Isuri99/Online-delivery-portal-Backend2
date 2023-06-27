package com.example.UserDashboardfirstpage.service;

import com.example.UserDashboardfirstpage.Repository.Order_statusRepository;
import com.example.UserDashboardfirstpage.model.Order_status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_statusServiceImpl implements Order_statusService {

    @Autowired
    private Order_statusRepository order_statusRepository;

    @Override
    public Order_status saveOrder_status(Order_status order_status) {
        return order_statusRepository.save(order_status);
    }

    @Override
    public List<Order_status> getAllOrder_statuses() {
        return order_statusRepository.findAll();
    }
}
