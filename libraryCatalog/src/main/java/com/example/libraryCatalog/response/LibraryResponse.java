package com.example.libraryCatalog.response;


import lombok.Data;

@Data
public class LibraryResponse<T> {
    public int status;
    public String description;
    public T data;
}
