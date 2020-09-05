package lista01;

/*
Carregar uma matriz [4 x 4 inteiro]. Apresentar:
1- Soma dos valores no intervalo de 1 a 100
2- Quantidade de números ímpares entre 30 a 50
3- Quantidade de números divisíveis por 8
4- Quantidade de números ímpares divisíveis por 3
5- Fatorial do maior número informado na matriz
 */

public class Ex04 {
	public static void main(String[]args) {
		
		int matriz[][] = new int[4][4];
		int soma=0; //tópico 1
		int cont1=0; //tópico 2
		int cont2=0; //tópico 3
		int cont3=0; //tópico 4
		//tópico 5
		double fat=0;
		int maior=0;
				
		geraValor(matriz); //carrega matriz
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(matriz[i][j]<100 && matriz[i][j]>1) {
					soma+=matriz[i][j];
				}
				if(matriz[i][j]<50 && matriz[i][j]>30 &&matriz[i][j]%2==1) {
					cont1++;
				}
				if(matriz[i][j]%8==0) {
					cont2++;
				}
				if(matriz[i][j]%3==0 && matriz[i][j]%2==1) {
					cont3++;
				}
				if(matriz[i][j]>maior) {
					maior=matriz[i][j];
				}
			}
		}
		fat= calcFat(maior);
		System.out.println(""
			  + "1- Soma dos valores no intervalo de 1 a 100: "+soma+"\r\n" + 
				"2- Quantidade de números ímpares entre 30 a 50: "+cont1+"\r\n" + 
				"3- Quantidade de números divisíveis por 8: "+cont2+"\r\n" + 
				"4- Quantidade de números ímpares divisíveis por 3: "+cont3+"\r\n" + 
				"5- Fatorial de "+maior+" é: "+fat);
	printaMatriz(matriz);
	}
	
	private static double calcFat(double fatorial) {
		
		if (fatorial==0) {
			return 1;
		}
		else {
			fatorial = fatorial*calcFat(fatorial-1);
			return fatorial;
		}				
	}
	
	private static void geraValor(int[][] matriz) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				int numero = (int)(Math.random()*300);
				matriz[i][j] = numero;
			}
		}
	}
	
	private static void printaMatriz(int[][] matriz) {
		for (int i=0;i<4;i++) {
			System.out.println("");
			for (int j=0;j<4;j++) {
				System.out.print(" "+matriz[i][j]);
			}
		}
	}
}
