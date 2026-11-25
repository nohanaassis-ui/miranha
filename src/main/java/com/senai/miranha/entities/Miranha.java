package com.senai.miranha.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Miranha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @Past
    private LocalDate nasc;
    @Positive
    private int idade;
    @CPF
    private String cpf;


    public Miranha(){

    }

    public Miranha(Long id, String nome, String email, LocalDate nasc, int idade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nasc = nasc;
        this.idade = idade;
        this.cpf = cpf;
    }


    public Miranha(String nome, String email, LocalDate nasc, int idade, String cpf) {
        this.nome = nome;
        this.email = email;
        this.nasc = nasc;
        this.idade = idade;
        this.cpf = cpf;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Miranha{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nasc=" + nasc +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }


}
