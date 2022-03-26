package com.example.JPA.modelDAO;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Class1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name_class1;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Class2 class2;


}
