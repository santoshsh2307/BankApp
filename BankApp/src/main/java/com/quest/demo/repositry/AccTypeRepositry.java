package com.quest.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.demo.entity.AccType;

public interface AccTypeRepositry extends JpaRepository<AccType, Long> {

}
