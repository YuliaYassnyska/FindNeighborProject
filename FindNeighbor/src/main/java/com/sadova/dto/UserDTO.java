package com.sadova.dto;

import com.sadova.domain.User;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.Link;


public class UserDTO  {
//    @NotNull
//    private int id;
//    @NotNull
//    private String lastName;
//
//    @NotNull
//    private String firstName;
//
//    @NotNull
//    private String email;

    User user;

//    public UserDTO(User user, Link selfLink) {
//        this.user = user;
//        add(selfLink);
//    }

}
