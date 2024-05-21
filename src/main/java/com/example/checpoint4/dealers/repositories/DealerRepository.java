package com.example.checpoint4.dealers.repositories;

import com.example.checpoint4.dealers.models.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {
}
