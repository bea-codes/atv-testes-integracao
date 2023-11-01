package com.example.servicos;

import com.example.cliente.Porte;
import com.example.servicos.TipoDeBanho;

public class Banho {
	private TipoDeBanho tipoDeBanho;
	private Porte porteDoAnimal;
	private double preco = 35.0;

	public Banho(TipoDeBanho tipoDeBanho, Porte porteDoAnimal) {
		this.tipoDeBanho = tipoDeBanho;
		this.porteDoAnimal = porteDoAnimal;
	}



	public double calcularPreco(){
		double precoTotal = getPreco();

		switch (porteDoAnimal) {
			case GRANDE:
				precoTotal =+ 20.0;
				break;
			case MEDIO:
				precoTotal =+ 15.0;
				break;
			case PEQUENO:
				precoTotal =+ 10.0;
				break;
			case MINI:
				precoTotal =+ 0.0;
				break;
			default:
				break;
		}

		switch (tipoDeBanho) {
			case PELOS_BRANCOS:
				precoTotal =+ 10.0;
				break;
			case PELOS_ESCUROS:
				precoTotal =+ 5.0;
				break;
			default:
				break;
		}
		
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
