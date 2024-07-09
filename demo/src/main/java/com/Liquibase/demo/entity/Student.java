package com.Liquibase.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "sequenceGenerater")
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String address;

    @ManyToOne
    private School school;


}
