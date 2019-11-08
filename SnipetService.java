package com.example.H2Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Service
public class SnipetService {
    @Autowired
    private SnipetRepository snipetRepository;

    public List<Snipet> list() {
        return snipetRepository.findAll();
    }

    public Snipet post(@RequestBody Snipet snipet) {
        return snipetRepository.save(snipet);
    }

    public Snipet getById(@PathVariable(value = "id") int id){
        Snipet snipet = snipetRepository.findById((long) id).orElseThrow(() -> new ResourceNotFoundException("Message", "id", id));
        delete(id);
        return snipet;
    }

    public ResponseEntity delete(@PathVariable(value = "id") int id){
        Snipet snipet = snipetRepository.findById((long) id)
                .orElseThrow(() -> new ResourceNotFoundException("Message", "id", id));
        snipetRepository.delete(snipet);
        return ResponseEntity.ok().build();
    }

    public Snipet patch(@PathVariable(value = "id") int id, @Valid @RequestBody Snipet message){
        Snipet snipet = snipetRepository.findById((long) id)
                .orElseThrow(() -> new ResourceNotFoundException("Message", "id", id));
        snipet.setId(id);
        snipet.setMessage(message.getMessage());
        Snipet updatedMessage = snipetRepository.save(snipet);
        return updatedMessage;
    }

}
