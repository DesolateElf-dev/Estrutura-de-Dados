package lista01;

/*
3- Carregar um vetor [100] inteiros positivos ou negativos. Classificar 
este vetor em ordem crescente e apresentar os valores.
 */

public class Ex03 {

	public static void main(String[] args) {
		int vetInt[] = new int[100];
		geraValor(vetInt);
		//printaVetor(vetInt);
		vetInt = ordenaVetor(vetInt);
		printaVetor(vetInt);
	}
	
	private static void geraValor(int[] vetorInt) {
		for (int i=0;i<100;i++) {
			int numero = (int)(Math.random()*200)-100;
			vetorInt[i] = numero;
		}
	}
	private static void printaVetor(int[] vetor) {
		for (int i=0;i<100;i++) {
			System.out.println(vetor[i]);
		}
	}
	
	private static int[] ordenaVetor(int[] vetor) {
		int temp=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(vetor[i]<vetor[j]) {
					temp=vetor[j];
					vetor[j]=vetor[i];
					vetor[i]=temp;
				}
			}
		}
		return vetor;
	}
	
	
}
