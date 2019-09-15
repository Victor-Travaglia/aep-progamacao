package com.aep.victor.aepprogramacao.conceito;

import com.aep.victor.aepprogramacao.aluno.Aluno;
import com.aep.victor.aepprogramacao.avaliacao.Avaliacao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class Conceito {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToOne
    private Aluno aluno;

    @OneToOne
    private Avaliacao avaliacao;

    private Conceito() {

    }

    public Conceito(Aluno aluno, Avaliacao avaliacao) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
    }

    public String getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }
}
