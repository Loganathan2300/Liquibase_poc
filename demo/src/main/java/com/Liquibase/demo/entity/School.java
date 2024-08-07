package com.Liquibase.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "school")
@Data
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "sequenceGenerater")
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

}
