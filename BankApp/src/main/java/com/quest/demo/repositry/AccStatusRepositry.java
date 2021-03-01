package com.quest.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.demo.entity.AccStatus;

public interface AccStatusRepositry extends JpaRepository<AccStatus, Long> {

}
