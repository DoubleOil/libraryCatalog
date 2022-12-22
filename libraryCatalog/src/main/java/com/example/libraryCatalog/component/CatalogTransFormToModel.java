package com.example.libraryCatalog.component;

import com.example.libraryCatalog.entity.LibraryCatalog;
import com.example.libraryCatalog.model.LibraryModel;
import org.springframework.stereotype.Component;

@Component
public class CatalogTransFormToModel {

    public LibraryModel TransFormCatalogtoModel(LibraryCatalog libraryCatalog){

        LibraryModel libraryModel = new LibraryModel();
        libraryModel.setBookid(libraryCatalog.getBookid());
        libraryModel.setBookname(libraryCatalog.getBookname());
        libraryModel.setBookstatus(libraryCatalog.getBookstatus());

        return libraryModel;
    }

    public LibraryCatalog TransFormModelToCatalog(LibraryModel libraryModel){
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        libraryCatalog.setBookid(libraryModel.getBookid());
        libraryCatalog.setBookname(libraryModel.getBookname());
        libraryCatalog.setBookstatus(libraryModel.getBookstatus());

        return libraryCatalog;
    }

}
