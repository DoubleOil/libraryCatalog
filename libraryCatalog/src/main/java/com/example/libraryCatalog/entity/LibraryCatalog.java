package com.example.libraryCatalog.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "LibraryCatalog")
@Data
public class LibraryCatalog{
    @Id
    @Column(name ="bookname")
    private String bookname;

    @Column(name = "bookid")
    private String bookid;

    @Column(name = "bookstatus")
    private String bookstatus;

}




