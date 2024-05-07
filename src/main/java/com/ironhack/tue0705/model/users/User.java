package com.ironhack.tue0705.model.users;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    // DEFAULT @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Friend> friends;

    @OneToOne(mappedBy = "bestFriendUser")
    private Friend myBestFriend;

    @OneToOne(mappedBy = "user")
    private DNI dni;
}
