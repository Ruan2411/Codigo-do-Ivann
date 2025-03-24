package br.com.petshop;

public class Cachorro extends Animal {
	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;

	}

	public void latir() {
		System.out.println(getNome() + " está latindo: Au! Au!");
	}

	public void exibirInfo() {
		System.out.println("\nCachorro");
		super.exibirInfo();
		System.out.println("Raça: " + raca);
		latir();

	}

}
