package com.senai.miranha.repositories;

import com.senai.miranha.entities.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MiranhaRepository extends JpaRepository< Miranha, Long> {
}
