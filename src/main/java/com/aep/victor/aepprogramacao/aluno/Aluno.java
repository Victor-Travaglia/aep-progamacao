package com.aep.victor.aepprogramacao.aluno;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Aluno {

    @Id
    private String id;
    private String nome;
    private Integer ra;

    private Aluno() {

    }

    public Aluno(String nome, Integer ra) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.ra = ra;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", ra=" + ra +
                '}';
    }
}
