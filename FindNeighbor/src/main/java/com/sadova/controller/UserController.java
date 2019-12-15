package com.sadova.controller;

import com.sadova.domain.User;
import com.sadova.dto.UserDTO;
import com.sadova.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
//
//    public ResponseEntity<List<UserDTO>> getAllUsers() throws NoSuchElementException {
//        List<User> allUsers = userService.findAllUsers();
//        Link link = linkTo(methodOn(UserController.class).getAllUsers()).withSelfRel();
//
//        List<UserDTO> userDTOS = new ArrayList<>();
//        for (AirportEntity entity : allUsers) {
//            Link selfLink = new Link(link.getHref() + "/" + entity.getId()).withSelfRel();
//            AirportDTO dto = new AirportDTO(entity, selfLink);
//            userDTOS.add(dto);
//        }
//
//        return new ResponseEntity<>(userDTOS, HttpStatus.OK);
//    }

    @GetMapping("/users")
    public String findAll(Model model) throws Exception {
        model.addAttribute("users", userService.findAllUsers());
        return "userList" ;
    }

   @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model) throws Exception {
        model.addAttribute("user", userService.findById(id));
        return "showUser";
    }
    @GetMapping("/addUser")
    public String createUserPage() throws Exception {
      //  userService.create(user);
        return "addUser";
    }
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) throws Exception {
        userService.create(user);
        return "addUser";
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) throws Exception {
        userService.update(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) throws Exception{
        model.addAttribute("user", userService.findById(id));
        userService.delete(id);
        return "editUser";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) throws Exception {
        userService.delete(id);
        return "redirect:/users";
    }


}
