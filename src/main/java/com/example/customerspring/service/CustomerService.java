package com.example.customerspring.service;

import com.example.customerspring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public CustomerService() {
    }

    public List<Customer> findAll(){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"hai1","hai1","HN"));
        list.add(new Customer(2,"hai2","hai2","HN"));
        list.add(new Customer(3,"hai3","hai3","HN"));
        list.add(new Customer(4,"hai4","hai4","HN"));
        list.add(new Customer(5,"hai5","hai5","HN"));
        return list;
    }
}
