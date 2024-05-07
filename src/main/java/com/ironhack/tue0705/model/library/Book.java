package com.ironhack.tue0705.model.library;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String isbn;

    //@ManyToOne
    //@JoinColumn(name = "author_id", referencedColumnName = "id")
    //private Author author;

    //@ManyToMany(mappedBy = "books")
    //private List<Author> authors;

    @ManyToMany
    @JoinTable(name = "library",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
    private List<Author> authors;
}
