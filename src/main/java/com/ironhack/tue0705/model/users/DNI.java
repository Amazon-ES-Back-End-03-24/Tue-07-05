package com.ironhack.tue0705.model.users;

import jakarta.persistence.*;

@Entity
@Table(name = "dnis")
public class DNI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id_test", referencedColumnName = "id")
    private User user;
}
