package com.ironhack.tue0705.model.business;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "hr_departments")
public class HRDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @OneToMany(mappedBy = "hrDepartment")
    private List<Employee> employees;
}
