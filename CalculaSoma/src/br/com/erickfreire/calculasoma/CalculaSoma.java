package br.com.erickfreire.calculasoma;

public class CalculaSoma {

	public static void main(String[] args) {
		int soma = 0;
		int numeros = 1;
		
		while(numeros < 11) {
			soma = soma + numeros;
			
			numeros++;
		}
		
		System.out.println("A soma total é de: " + soma);

	}

}
