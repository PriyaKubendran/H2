package com.example.H2Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Optional;

@Repository
public interface SnipetRepository extends JpaRepository<Snipet, Long>{
    public Snipet Post(String message);

}