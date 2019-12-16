package com.sadova.controller;

import com.sadova.domain.AdditionalInfo;
import com.sadova.domain.Address;
import com.sadova.service.AdditionalInfoService;
import com.sadova.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/additionalInfo")
public class AdditionalInfoController {

    @Autowired
    public AdditionalInfoService additionalInfoService;

    @GetMapping("/addAdditionalInfo")
    public String findAll(Model model) throws Exception {
//        model.addAttribute("addresses", addressService.findAllAddress());
        return "addAdditionalInfo" ;
    }
    @PostMapping("/addAdditionalInfo")
    public String addAddress(@ModelAttribute("additionalInfo") AdditionalInfo additionalInfo) throws Exception {
        additionalInfoService.create(additionalInfo);
        return "addAdditionalInfo";
    }
}
