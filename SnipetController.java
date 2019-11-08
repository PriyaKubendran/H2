package com.example.H2Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SnipetController {
    @Autowired SnipetService snipetService;


    // Get All messages
    @GetMapping("/message")
    public List<Snipet> getAllMessages() {
        return snipetService.list();
    }

    // Post a message
    @PostMapping("/message")
    public Snipet createMessage(@Valid @RequestBody Snipet message){
        return snipetService.post(message);
    }

    // Read a specific message and delete it
    @GetMapping("/message/{id}")
    public Snipet getMessage(@PathVariable(value = "id") int id) {
        return snipetService.getById(id);
    }

    // Update a message
    @PatchMapping("/message/{id}")
    public Snipet updateNote(@PathVariable(value = "id") int id, @Valid @RequestBody Snipet snipet) {
    return snipetService.patch(id,snipet);
        }

    }

