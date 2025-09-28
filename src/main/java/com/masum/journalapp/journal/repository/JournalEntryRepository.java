package com.masum.journalapp.journal.repository;

import com.masum.journalapp.journal.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
