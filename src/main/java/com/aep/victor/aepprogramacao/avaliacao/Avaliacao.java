package com.aep.victor.aepprogramacao.avaliacao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class Avaliacao {

    @Id
    private String id;
    private String nome;

    @OneToOne
    private Nota nota;

    private Avaliacao() {

    }

    public Avaliacao(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
    }

    public void adicionarNota(Nota nota) {
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Nota getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
