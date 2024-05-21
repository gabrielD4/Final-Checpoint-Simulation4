package com.example.checpoint4.dealers.services;

import com.example.checpoint4.dealers.models.Dealer;
import com.example.checpoint4.dealers.repositories.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    public Dealer create (Dealer dealer) {
        return dealerRepository.save(dealer);
    }
}
