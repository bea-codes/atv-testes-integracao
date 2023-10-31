package com.example.atendimento;

public class Atendimento {
	private String dataHora;
    private double precoServico;
    private String tipoDeServico;
    private String cliente;


    
    public Atendimento(String dataHora, double precoServico, String tipoDeServico, String cliente) {
        this.dataHora = dataHora;
        this.precoServico = precoServico;
        this.tipoDeServico = tipoDeServico;
        this.cliente = cliente;
    }

    
    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

