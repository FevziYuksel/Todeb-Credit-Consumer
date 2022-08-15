package com.example.creditapplicationconsumer.repository;

import com.example.creditapplicationconsumer.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {

}
