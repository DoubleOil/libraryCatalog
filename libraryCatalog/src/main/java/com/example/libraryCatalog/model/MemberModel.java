package com.example.libraryCatalog.model;


import lombok.Data;

@Data
public class MemberModel {

    private long member;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String gender;
    private String statusmember;

}
