package com.masum.journalapp.journal.controller;

import com.masum.journalapp.journal.entity.JournalEntry;
import com.masum.journalapp.journal.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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
        return null;
    }

    @PostMapping
    public boolean postEntry(@RequestBody JournalEntry journalEntry) {
        return true;
    }

    @GetMapping("id/{id}")
    public JournalEntry getEntryById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("id/{id}")
    public JournalEntry deleteEntryById(@PathVariable Long id) {

        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateEntrybyId(@PathVariable Long id, @RequestBody JournalEntry journalEntry) {
        return null;
    }
}
