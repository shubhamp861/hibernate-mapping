package com.example.JPA.modelDAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Class1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name_class1;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "mapped_comment",
    joinColumns = {@JoinColumn(name = "class1_id")},
            inverseJoinColumns = {@JoinColumn(name = "class2_id")}
    )
    @JsonIgnore
    private List<Class2> class2List = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_class1() {
        return name_class1;
    }

    public void setName_class1(String name_class1) {
        this.name_class1 = name_class1;
    }

    public List<Class2> getClass2List() {
        return class2List;
    }

    public void setClass2List(List<Class2> class2List) {
        this.class2List = class2List;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "id=" + id +
                ", name_class1='" + name_class1 + '\'' +
                ", class2List=" + class2List +
                '}';
    }
}
