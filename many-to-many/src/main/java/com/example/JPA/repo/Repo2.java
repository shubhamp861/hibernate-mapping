package com.example.JPA.repo;

import com.example.JPA.modelDAO.Class1;
import com.example.JPA.modelDAO.Class2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo2 extends JpaRepository<Class2,Integer> {
}
