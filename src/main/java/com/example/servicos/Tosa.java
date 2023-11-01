package com.example.servicos;

import com.example.cliente.Porte;

public class Tosa {
	private TipoDeTosa TipoDeTosa;
	private Porte porteDoAnimal;
	private double preco = 35.0;
	
	public Tosa(com.example.servicos.TipoDeTosa tipoDeTosa, Porte porteDoAnimal) {
		TipoDeTosa = tipoDeTosa;
		this.porteDoAnimal = porteDoAnimal;
	}

	public double calcularPreco(){
		double precoTotal = getPreco();

		switch (TipoDeTosa) {
			case NA_MAQUINA:
				precoTotal =+ 10.0;
				break;
			case NA_TESOURA:
				precoTotal =+ 25.0;
				break;
			default:
				break;
		}

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

		return precoTotal;
	}


	public TipoDeTosa getTipoDeTosa() {
		return TipoDeTosa;
	}

	public Porte getPorteDoAnimal() {
		return porteDoAnimal;
	}

	public double getPreco() {
		return preco;
	}

	public void setTipoDeTosa(TipoDeTosa tipoDeTosa) {
		TipoDeTosa = tipoDeTosa;
	}

	public void setPorteDoAnimal(Porte porteDoAnimal) {
		this.porteDoAnimal = porteDoAnimal;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	

}
