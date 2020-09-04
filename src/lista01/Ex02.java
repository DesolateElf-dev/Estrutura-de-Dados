package lista01;
/*
2-  Carregar um vetor [5] inteiro. Enviar cada elemento para uma função e esta 
irá retornar o seu fatorial que será armazenado em um outro vetor. 
Exibir os dados dos vetores
*/

public class Ex02 {

	public static void main(String[] args) {
		int vetorInt[] = new int[5];
		int vetorFat[] = new int[5];
		
		geraValor(vetorInt);
		
		for(int i=0;i<5;i++) {
			vetorFat[i] = calcFat(vetorInt[i]);
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+" = "+vetorInt[i]+"! = "+vetorFat[i]);
		}
	}
	
	private static int calcFat(int fatorial) {
	
		if (fatorial==0) {
			return 1;
		}
		else {
			fatorial = fatorial*calcFat(fatorial-1);
			return fatorial;
		}				
	}

	private static void geraValor(int[] vetorInt) {
		for (int i=0;i<5;i++) {
			int numero = (int)(Math.random()*10);
			vetorInt[i] = numero;
		}
	}
}
