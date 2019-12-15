package com.sadova.config;

import com.sadova.DAO.UserDAO;
import com.sadova.domain.Address;
import com.sadova.domain.User;
import com.sadova.service.AddressService;
import com.sadova.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public User getUser(){
        return new User();
    }

    @Bean
    public UserService getUserService(){
        return new UserService();
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }

    @Bean
    public AddressService getAddressService(){
        return new AddressService();
    }

}
