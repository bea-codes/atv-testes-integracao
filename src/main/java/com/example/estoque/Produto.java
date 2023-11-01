package com.example.estoque;

public enum Produto {
        RACAO("Racao", 10.0),
        COLEIRA("Coleira", 5.0);
    
        private String nome;
        private double preco;
    
        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    
        public String getNome() {
            return nome;
        }
    
        public double getPreco() {
            return preco;
        }
        
}
