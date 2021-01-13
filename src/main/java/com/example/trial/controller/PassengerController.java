package com.example.trial.controller;

import com.example.trial.entity.Passenger;
import com.example.trial.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/save")
    public Passenger savePassenger(@RequestBody  Passenger passenger){
       return passengerService.savePassenger(passenger);
    }

    @GetMapping("/getAllPassengers")
    public List<Passenger> getPassenger(){
        return passengerService.getAllPassenger();
    }

    @GetMapping("/login")
    public Boolean validateLogin(@RequestParam("passengerEmail")String email,@RequestParam("passengerPassword")String password){
      return passengerService.loginPassenger("8220697841","Passenger1Password");
    }


}
