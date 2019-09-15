package com.aep.victor.aepprogramacao.avaliacao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Nota {

    @Id
    private String id;
    private Double valor;

    public Nota(Double valor) {
        if (valor.equals(null) && valor > 10 || valor < 0) {
            throw new RuntimeException("Nota deve estar entre os valores 0 e 10");
        }
        this.id = UUID.randomUUID().toString();
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
