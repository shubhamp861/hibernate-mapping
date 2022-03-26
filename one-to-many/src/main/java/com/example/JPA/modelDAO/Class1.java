package com.example.JPA.modelDAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Class1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name_class1;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cq_id",referencedColumnName = "id")
    private List<Class2> class2List = new ArrayList<>();
}
