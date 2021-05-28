package com.example.spring;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CodeInterface extends JpaRepository<Info, Long> {


}

