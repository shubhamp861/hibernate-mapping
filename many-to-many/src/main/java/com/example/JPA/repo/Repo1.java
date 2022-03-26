package com.example.JPA.repo;

import com.example.JPA.modelDAO.Class1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo1 extends JpaRepository<Class1,Integer> {
}
