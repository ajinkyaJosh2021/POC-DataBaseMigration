package com.hdfc.data.poc.data.migration.oracle.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "college",schema = "anonymous")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "collegeId")
    private Long id;
    @Column(name = "collegeName")
    private String name;
    @Column(name = "collegeLocation")
    private String location;
}