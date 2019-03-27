package com.example.service;

import com.example.enity.Rating;
import com.example.repo.Repo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service1 {
    @Autowired
    private Repo1 userRepo;

    public List<Rating> findall()
    {
        List<Rating> userList = new ArrayList<>();
        userRepo.findAll()
                .forEach(userList::add);
        return userList;
    }

    public void saveUser(Rating user)
    {
        System.out.println("adding users");
        userRepo.save(user);
    }

}
