package com.quest.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.demo.entity.BankTranjection;

public interface BankTranjectionrepositry extends JpaRepository<BankTranjection, Long> {

}
