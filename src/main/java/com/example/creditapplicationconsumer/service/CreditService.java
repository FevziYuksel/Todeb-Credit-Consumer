package com.example.creditapplicationconsumer.service;

import com.example.creditapplicationconsumer.model.Credit;
import com.example.creditapplicationconsumer.repository.CreditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreditService {

    private final CreditRepository creditRepository;

    public Credit addCredit(Credit credit){

        return creditRepository.save(credit);
    }


}
