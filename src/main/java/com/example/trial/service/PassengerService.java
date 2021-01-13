package com.example.trial.service;

import com.example.trial.dao.PassengerDao;
import com.example.trial.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerDao passengerRepo;

    public Passenger savePassenger(Passenger passenger){
        if( (isEmailAvailable(passenger.getPassengerEmail()))!=null || (isPhoneAvailable(passenger.getPassengerPhone()))!=null ){
            return passenger;
        }else {
            return passengerRepo.save(passenger);
        }
    }

    public List<Passenger> getAllPassenger() {
        return passengerRepo.findAll();
    }


    public Passenger isEmailAvailable(String email){
        return passengerRepo.findByPassengerEmail(email);
    }

    public Passenger isPhoneAvailable(String phone){
        return passengerRepo.findByPassengerPhone(phone);
    }

    public Boolean loginPassenger(String emailOrPhone, String password){
        Boolean login=false;
        if (passengerRepo.findByPassengerEmailAndAndPassengerPassword(emailOrPhone,password)!=null){
            login = true;
        }else if (passengerRepo.findByPassengerPhoneAndAndPassengerPassword(emailOrPhone,password)!=null){
            login = true;
        }
        return login;
    }

}
