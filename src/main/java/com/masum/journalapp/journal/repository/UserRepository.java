package com.masum.journalapp.journal.repository;

import com.masum.journalapp.journal.entity.JournalEntry;
import com.masum.journalapp.journal.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);
}
