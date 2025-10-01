package com.masum.journalapp.journal.entity;


import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "users")
@Data
public class User {

    private String id;
    private String name;
    private String username;
    private String password;
}
