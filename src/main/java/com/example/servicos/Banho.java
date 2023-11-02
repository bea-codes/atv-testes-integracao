package com.example.servicos;

import com.example.cliente.Porte;

public class Banho {
	private TipoDeBanho tipoDeBanho;
	private Porte porteDoAnimal;
	private double preco = 35.0;

	public Banho(TipoDeBanho tipoDeBanho, Porte porteDoAnimal) {
		this.tipoDeBanho = tipoDeBanho;
		this.porteDoAnimal = porteDoAnimal;
	}



	public double calcularPreco(TipoDeBanho tipoDeBanho, Porte porteDoAnimal){
		double precoTotal = getPreco();
		double taxaDePorte = 0;
		double taxaDePelo =  0;

		switch (porteDoAnimal) {
			case GRANDE:
				taxaDePorte =+ 20.0;
				break;
			case MEDIO:
				taxaDePorte =+ 15.0;
				break;
			case PEQUENO:
				taxaDePorte =+ 10.0;
				break;
			case MINI:
				taxaDePorte =+ 0.0;
				break;
			default:
				break;
		}

		switch (tipoDeBanho) {
			case PELOS_BRANCOS:
				taxaDePelo =+ 10.0;
				break;
			case PELOS_ESCUROS:
				taxaDePelo =+ 5.0;
				break;
			default:
				break;
		}

		precoTotal = precoTotal + taxaDePelo + taxaDePorte;
		
		return precoTotal;

	}



	public TipoDeBanho getTipoDeBanho() {
		return tipoDeBanho;
	}



	public Porte getPorteDoAnimal() {
		return porteDoAnimal;
	}



	public double getPreco() {
		return preco;
	}



	public void setTipoDeBanho(TipoDeBanho tipoDeBanho) {
		this.tipoDeBanho = tipoDeBanho;
	}



	public void setPorteDoAnimal(Porte porteDoAnimal) {
		this.porteDoAnimal = porteDoAnimal;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	
}
