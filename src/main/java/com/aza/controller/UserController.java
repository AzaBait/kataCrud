package com.aza.controller;

import com.aza.model.User;
import com.aza.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String users(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }


    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user",userService.getById(id));
        return "edit";
    }


    @PatchMapping("/edit")
    public String update2(@ModelAttribute("user") User user){
        this.userService.update(user);
        return "redirect:/";
    }


    @GetMapping("/new")
    public String addUser(User user) {
        return "newUser";
    }

    @PostMapping("/new")
    public String addUser2(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable("id") Long id){
        this.userService.delete(id);
        return "redirect:/";
    }
}
