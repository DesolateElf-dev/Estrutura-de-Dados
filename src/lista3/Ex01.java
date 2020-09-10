package lista3;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		
		int fila[] = new int[5];
		int inicio=0;
		int fim=0;
		int tamanho=0;
		int opc=0;
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar \n2- Remover \n3-Printar \n9-Finalizar"));
			switch (opc){
				case 1:	{
					if(tamanho>=5) {
						System.out.println("Fila cheio");
						break;
					}
					else {
						if(tamanho==0) {
							int valor = (int)(Math.random()*10);//Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
							fila[fim] = valor;
							tamanho++;
						}
						else {
							int valor = (int)(Math.random()*10);//Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
							fila[fim] = valor;
							tamanho++;
							fim++;
						}
						break;
					}
				}
				case 2:	{
					int valor = removeValor(fila, inicio, fim, tamanho);
					System.out.println(valor);
				}
				break;
				
				case 3:{
					for(int i=0;i<5;i++) {
						System.out.print(" "+fila[i]);
					}
					System.out.println("");
				}
				
				case 9: break;
			}
		}
	}
	
	private static int removeValor(int fila[], int inicio, int fim, int tamanho) {
		int temp = fila[inicio];
		tamanho--;
		inicio++;
		return(temp);
	}	

}
