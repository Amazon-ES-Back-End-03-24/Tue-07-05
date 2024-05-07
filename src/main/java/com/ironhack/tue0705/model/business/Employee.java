package com.ironhack.tue0705.model.business;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "hr_department_id", referencedColumnName = "id")
    private HRDepartment hrDepartment;
}
