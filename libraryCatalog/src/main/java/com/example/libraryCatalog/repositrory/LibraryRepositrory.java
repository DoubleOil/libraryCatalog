package com.example.libraryCatalog.repositrory;


import com.example.libraryCatalog.entity.LibraryCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepositrory extends JpaRepository<LibraryCatalog,String> {
}

