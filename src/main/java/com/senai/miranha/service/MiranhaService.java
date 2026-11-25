package com.senai.miranha.service;

import com.senai.miranha.entities.Miranha;
import com.senai.miranha.repositories.MiranhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiranhaService {

    private final MiranhaRepository miranhaRepository;

    public MiranhaService(MiranhaRepository miranhaRepository) {
        this.miranhaRepository = miranhaRepository;
    }

    public Miranha salvar(Miranha miranha) {
        return miranhaRepository.save(miranha);
    }

    public List<Miranha> listar() {
        return miranhaRepository.findAll();
    }


}
