package com.masum.journalapp.journal.controller;

import com.masum.journalapp.journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journals")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean postEntry(@RequestBody JournalEntry journalEntry) {
        journalEntries.put(journalEntry.getId(), journalEntry);
        return true;
    }

    @GetMapping("id/{id}")
    public JournalEntry getEntryById(@PathVariable Long id) {
        return journalEntries.get(id);
    }
}
