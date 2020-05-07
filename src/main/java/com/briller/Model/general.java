package com.briller.Model;

import javax.persistence.*;

@Entity
public class general {


    private int id;
    private String name;

    public general(int i, String n) {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq",sequenceName = "id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
