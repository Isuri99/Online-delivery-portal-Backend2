package com.example.UserDashboardfirstpage.controller;

import com.example.UserDashboardfirstpage.model.Order_status;
import com.example.UserDashboardfirstpage.service.Order_statusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_status")
@CrossOrigin
public class Order_statusController {
    @Autowired
    private Order_statusService order_statusService;

    @PostMapping("/add")
    public String add(@RequestBody Order_status order_status){
        order_statusService.saveOrder_status(order_status);
        return "New Order is added";
    }
    @GetMapping("/getAll")
    public List<Order_status> getAllOrder_statuses(){
       return order_statusService.getAllOrder_statuses();
    }
}
