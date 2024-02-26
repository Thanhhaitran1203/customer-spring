package com.example.customerspring.controller;
import java.util.List;
import com.example.customerspring.model.Customer;
import com.example.customerspring.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@Controller
public class CustomerController {
    CustomerService customerService = new CustomerService();
//    @GetMapping("/customers")
//    public String showList() {
//        return "list";
//    }

//    @GetMapping("/customers")
//    public String showList(HttpServletRequest request) {
//        List<Customer> customers = customerService.findAll();
//        request.setAttribute("customers", customers);
//        return "list";
//    }
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
