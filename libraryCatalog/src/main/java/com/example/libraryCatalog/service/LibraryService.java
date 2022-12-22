package com.example.libraryCatalog.service;


import com.example.libraryCatalog.component.CatalogTransFormToModel;
import com.example.libraryCatalog.entity.LibraryCatalog;
import com.example.libraryCatalog.model.LibraryModel;
import com.example.libraryCatalog.repositrory.LibraryRepositrory;
import com.example.libraryCatalog.response.LibraryResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
public class LibraryService {

    public LibraryRepositrory libraryRepositrory;
    public CatalogTransFormToModel catalogTransFormToModel;

    public LibraryService(LibraryRepositrory libraryRepositrory, CatalogTransFormToModel catalogTransFormToModel){
        this.libraryRepositrory = libraryRepositrory;
        this.catalogTransFormToModel = catalogTransFormToModel;

    }

    public void update(LibraryCatalog libraryCatalog) {
         libraryRepositrory.save(libraryCatalog);

    }

    public LibraryResponse<LibraryCatalog> getAllBook() {
        return (LibraryResponse<LibraryCatalog>) libraryRepositrory.findAll();
    }

    public LibraryResponse<LibraryCatalog> getByBookId(String bookid) {
        LibraryResponse result = new LibraryResponse<>();
        result.setStatus(404);
        result.setDescription("bookid not found");

        try{
            Optional<LibraryCatalog> optional = this.libraryRepositrory.findById(bookid);
            if (optional.isPresent()){
                LibraryCatalog libraryCatalog = optional.get();
                LibraryModel data = this.catalogTransFormToModel.TransFormCatalogtoModel(libraryCatalog);
                result.setData(data);
                result.setStatus(200);
                result.setDescription("OK");
            }

        }catch (Exception e){
            result.setStatus(500);
            result.setDescription(e.getMessage());
        }
        return result;
    }
}
