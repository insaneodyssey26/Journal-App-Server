package com.masum.journalapp.journal.entity;


import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "users")
@Data
public class User {
    @Id
    private String id;
    @Indexed (unique = true)
    @NonNull
    private String username;
    @NonNull
    private String password;
}
