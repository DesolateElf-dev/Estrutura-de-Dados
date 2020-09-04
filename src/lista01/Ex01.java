package lista01;

/*
1- Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
- Média dos saldos positivos entre 100 à 1000
- Média geral dos saldos
- Soma dos saldos negativos
 */

public class Ex01 {

	public static void main(String[] args) {
		double soma=0;
		double soma2=0;
		int cont=0;
		double med=0;
		double med2=0;
		
		double saldos[] = new double[100];	
		
		geraValor(saldos);
		for(int i=0; i<100;i++) {
			if (saldos[i]>=100 && saldos[i]<=1000){
				soma+=saldos[i];
				cont++;
				med = soma/cont;
			}
			med2 += saldos[i];
			if (saldos[i]<0) {
				soma2+=saldos[i];
			}
		}
		System.out.printf("A média entre 100 e 1000 é: R$ %.2f %n", med);
		System.out.printf("A média geral é: R$ %.2f %n", med2);
		System.out.printf("A soma dos saldos negativos é: R$ %.2f %n", soma2);
		
	}
	
	public static void geraValor(double[] saldos) {
		for (int i=0;i<100;i++) {
			double valor = (Math.random()*10000)-5000;
			saldos[i] = valor;			
		}
	}

}
