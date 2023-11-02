package com.example.funcionários;

public class Funcionario {
        private String nome;      
        private Cargo cargo;      
        private double salario;  
//Construtores
        public Funcionario(String nome, Cargo cargo, double salario) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }
//Getters e Setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public Cargo getCargo() {
            return cargo;
        }
    
        public void setCargo(Cargo cargo) {
            this.cargo = cargo;
        }

        public double getSalario() {
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
        }
//Calcular bonus mensal baseado no cargo
        public double calcularSalarioBonus(Cargo cargo) {

            double salarioCalculado = getSalario();

            switch (cargo) {
                case RECEPCIONISTA:
                    salarioCalculado*= 1.1; //10% de bonus
                    break;
    
                case ATENDENTE:
                    salarioCalculado*=1.15; //15% de bonus
                    break;
                case GERENTE:
                    salarioCalculado*=1.2; //20% de bonus
                    break;
            }
          
            return salarioCalculado;

        }

    
}
