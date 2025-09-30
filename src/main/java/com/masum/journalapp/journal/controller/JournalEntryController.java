package com.masum.journalapp.journal.controller;

import com.masum.journalapp.journal.entity.JournalEntry;
import com.masum.journalapp.journal.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journals")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return journalEntryService.findAll();
    }

    @PostMapping
    public JournalEntry postEntry(@RequestBody JournalEntry journalEntry) {
        journalEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(journalEntry);
        return journalEntry;
    }

    @GetMapping("id/{id}")
    public ResponseEntity<JournalEntry> getEntryById(@PathVariable ObjectId id) {
        Optional<JournalEntry> journalEntry = journalEntryService.findById(id);
        if (journalEntry.isPresent()) {
            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{id}")
    public boolean deleteEntryById(@PathVariable ObjectId id) {

        journalEntryService.deleteById(id);
        return true;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateEntrybyId(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {
        JournalEntry oldEntry = journalEntryService.findById(id).orElse(null);
        if (oldEntry != null) {
            oldEntry.setTitle((newEntry.getTitle() != null) ? newEntry.getTitle() : oldEntry.getTitle());
            oldEntry.setContent((newEntry.getContent() != null) ? newEntry.getContent() : oldEntry.getContent());
        }

        journalEntryService.saveEntry(oldEntry);
        return oldEntry;
    }
}
