package com.example.libraryCatalog.restcontroller;


import com.example.libraryCatalog.entity.LibraryCatalog;
import com.example.libraryCatalog.response.LibraryResponse;
import com.example.libraryCatalog.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/books")
public class LibraryController {

    @Autowired
    public LibraryService libraryService;


    @GetMapping
    public LibraryResponse<LibraryCatalog> getAllBook() {
        return  libraryService.getAllBook();
    }

    @GetMapping("/{bookid}")
    public LibraryResponse<LibraryCatalog>getByBookId(@PathVariable(name = "bookid")String bookid){
        return libraryService.getByBookId(bookid);

    }

    @PutMapping("/update/{bookid}")
    public LibraryCatalog update(LibraryCatalog libraryCatalog, @PathVariable String bookid){
        libraryCatalog.setBookid(bookid);
        libraryService.update(libraryCatalog);
        return libraryCatalog;
    }

}