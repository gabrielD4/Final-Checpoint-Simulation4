package com.example.checpoint4.dealers.controllers;

import com.example.checpoint4.dealers.models.Dealer;
import com.example.checpoint4.dealers.services.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/dealers")
public class DealerController {

    @Autowired
    private DealerService dealerService;

    @PostMapping
    public ResponseEntity<Dealer> create(@RequestBody Dealer dealer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(dealerService.create(dealer));
    }
}
