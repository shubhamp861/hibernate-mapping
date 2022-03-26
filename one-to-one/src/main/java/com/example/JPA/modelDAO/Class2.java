package com.example.JPA.modelDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Class2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Text;

}
