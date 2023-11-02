package com.example.servicos;

import com.example.cliente.Porte;

public class Tosa {
	private TipoDeTosa tipoDeTosa;
	private Porte porteDoAnimal;
	private double preco = 35.0;
	
	public Tosa(TipoDeTosa tipoDeTosa, Porte porteDoAnimal) {
		this.tipoDeTosa = tipoDeTosa;
		this.porteDoAnimal = porteDoAnimal;
	}

	public double calcularPreco(TipoDeTosa tipoDeTosa, Porte porteDoAnimal){
		double precoTotal = getPreco();
		double taxaDePelo = 0;
		double taxaTipoTosa = 0;

		switch (tipoDeTosa) {
			case NA_MAQUINA:
				taxaTipoTosa =+ 10.0;
				break;
			case NA_TESOURA:
				taxaTipoTosa =+ 25.0;
				break;
			default:
				break;
		}

		switch (porteDoAnimal) {
		case GRANDE:
			taxaDePelo =+ 20.0;
			break;
		case MEDIO:
			taxaDePelo =+ 15.0;
			break;
		case PEQUENO:
			taxaDePelo =+ 10.0;
			break;
		case MINI:
			taxaDePelo =+ 0.0;
			break;
		default:
			break;
		}

		precoTotal = precoTotal + taxaDePelo +taxaTipoTosa;

		return precoTotal;
	}

	public TipoDeTosa getTipoDeTosa() {
		return tipoDeTosa;
	}

	public Porte getPorteDoAnimal() {
		return porteDoAnimal;
	}

	public double getPreco() {
		return preco;
	}

	public void setTipoDeTosa(TipoDeTosa tipoDeTosa) {
		this.tipoDeTosa = tipoDeTosa;
	}

	public void setPorteDoAnimal(Porte porteDoAnimal) {
		this.porteDoAnimal = porteDoAnimal;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	
	

}
