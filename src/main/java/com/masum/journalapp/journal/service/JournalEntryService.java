package com.masum.journalapp.journal.service;

import com.masum.journalapp.journal.entity.JournalEntry;
import com.masum.journalapp.journal.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry entry) {
        journalEntryRepository.save(entry);
    }
}
