package com.masum.journalapp.journal.controller;

import com.masum.journalapp.journal.entity.JournalEntry;
import com.masum.journalapp.journal.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journals")
public class JournalEntryControllerV2 {

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
    public JournalEntry getEntryById(@PathVariable ObjectId id) {
        return null;
    }

    @DeleteMapping("id/{id}")
    public JournalEntry deleteEntryById(@PathVariable ObjectId id) {

        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateEntrybyId(@PathVariable ObjectId id, @RequestBody JournalEntry journalEntry) {
        return null;
    }
}
