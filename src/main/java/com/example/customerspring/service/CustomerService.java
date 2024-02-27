package com.example.customerspring.service;

import com.example.customerspring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> list = new ArrayList<>();
    public CustomerService() {
        list.add(new Customer(1,"hai1","hai1","HN"));
        list.add(new Customer(2,"hai2","hai2","HN"));
        list.add(new Customer(3,"hai3","hai3","HN"));
        list.add(new Customer(4,"hai4","hai4","HN"));
        list.add(new Customer(5,"hai5","hai5","HN"));
    }

    public List<Customer> findAll(){

        return list;
    }

    public Customer findById(Long id) {
    Customer customer = new Customer();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id ){
                customer = list.get(i);
            }
        }
        return customer;
    }
    public Customer findById(int id) {
        Customer customer = new Customer();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id ){
                customer = list.get(i);
            }
        }
        return customer;
    }

    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
