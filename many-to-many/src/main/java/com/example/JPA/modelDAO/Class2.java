package com.example.JPA.modelDAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Class2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String Text;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "class2List")
    @JsonIgnore
    private List<Class1> class1 = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public List<Class1> getClass1() {
        return class1;
    }

    public void setClass1(List<Class1> class1) {
        this.class1 = class1;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "id=" + id +
                ", Text='" + Text + '\'' +
                ", class1=" +
                '}';
    }
}
