package lista01;

/*
5- Criar e carregar uma matriz [4 x 4] inteiro, onde os valores da diagonal 
principal serão carregados pela aplicação conforme o gráfico e os 
demais dados serão digitados pelo usuário

1
	3
		9
			27
*/
public class Ex05 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					matriz[i][j]=(int) Math.pow(3, i);
				}
			}
		}
		geraValor(matriz);
		printaMatriz(matriz);		
	}
	
	private static void geraValor(int[][] matriz) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				if(i!=j) {
					int numero = (int)(Math.random()*30);
					matriz[i][j] = numero;
				}
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
