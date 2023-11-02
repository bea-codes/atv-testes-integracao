package com.example.cliente;

public class Cliente {
    private String nome;
    private String tipoAnimal;
    private int idade;
    private String endereco;
    private boolean primeiraVisita;

    // Construtor
    public Cliente(String nome, String tipoAnimal, int idade, String endereco, boolean primeiraVisita) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.endereco = endereco;
        this.primeiraVisita = primeiraVisita;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPrimeiraVisita() {
        return primeiraVisita;
    }

    public void setPrimeiraVisita(boolean primeiraVisita) {
        this.primeiraVisita = primeiraVisita;
    }

    // Funções específicas do cliente da petshop
    public void agendarConsulta(String data) {
        System.out.println("Consulta agendada para " + data);
    }

    public void realizarCompra(String produto) {
        System.out.println("Compra realizada: " + produto);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Animal: " + tipoAnimal);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Primeira Visita: " + (primeiraVisita ? "Sim" : "Não"));
    }
}