package lista02;

public class Ex01 {

	public static void main(String[] args) {
		
		

	}
	
	public void metodoA (int pos, int valor){
		int tamanho = 10;
		int dados[] = new int[tamanho];
		
		if(dados.length == tamanho) {
			System.out.println(("ERRO"));	
		}
		else {
			if(pos<=0 || pos>tamanho+1) {
				System.out.println("Posição Inválida");
			}
			else {
				if(pos==1) {
					adicionaInicio(valor);	
				}
				else {
					if(pos==tamanho) {
						adicionaFinal(valor);
					}
					else {
						for(int i=tamanho;i>=pos;i--) {
							dados[i]=dados[i-1];
							dados[pos-1]=valor;
							tamanho++;
						}
					}
				}
			}
		}
	}
	
	private void adicionaInicio(int vetor) {
		
	}
	
	private void adicionaFinal(int vetor) {
		
	}
	
}