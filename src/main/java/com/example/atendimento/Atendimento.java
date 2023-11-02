package com.example.atendimento;
import java.util.Date;  


public class Atendimento {
    private Date data;
    private String tipoAtendimento;
    // outros atributos e métodos

    // Construtor
    public Atendimento(Date data, String tipoAtendimento) {
        this.data = data;
        this.tipoAtendimento = tipoAtendimento;
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

   
}

