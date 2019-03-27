package com.example.controller;

import com.example.enity.Rating;
import com.example.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller1 {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "welcomehome";
    }

    @GetMapping("/welcome")
    public String index1() {
        try {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("welcome");
            return "welcome";
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return "welcome";
    }


    @Autowired
    private Service1 jpaService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getuser")
    public List<Rating> getAllList()
    {
        List<Rating> userList = new ArrayList<>();
        jpaService.findall()
                .forEach(userList::add);
        return userList;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/adduser", consumes = "application/json")
    public void addUser(@RequestBody Rating user)
    {
        System.out.println("adding users");
        jpaService.saveUser(user);
    }


}
