package com.sadova.controller;

import com.sadova.domain.Address;
import com.sadova.domain.User;
import com.sadova.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    public AddressService addressService;
    @GetMapping("/addAddress")
    public String findAll(Model model) throws Exception {
//        model.addAttribute("addresses", addressService.findAllAddress());
        return "addAddress" ;
    }

//    @GetMapping("/addAddress/{id}")
//    public String getById(@PathVariable("id") int id, Model model) throws Exception {
//        model.addAttribute("address", addressService.findById(id));
//        return "addAddress";
////    }
//    @GetMapping("/addAddress")
//    public String createAddress() throws Exception {
//        //  userService.create(user);
//        return "addAddress";
//    }
    @PostMapping("/addAddress")
    public String addAddress(@ModelAttribute("address") Address address) throws Exception {
        addressService.create(address);
        return "addAddress";
    }
}
