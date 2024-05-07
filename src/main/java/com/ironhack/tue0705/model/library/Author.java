package com.ironhack.tue0705.model.library;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    //@OneToMany(mappedBy = "author")
    //private List<Book> books;

/*  @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books; */


    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
