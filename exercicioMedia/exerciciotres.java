import java.util.Scanner;

public class exerciciotres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		final int TAM = 10;
		int a[], i, soma = 0 ;
		a = new int [TAM];
		for(i=0; i<TAM; i++){
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = new Scanner (System.in).nextInt();
			soma +=a[i];
	}
	
		double media = (double) soma/10;
		
		System.out.println("media dos valores é: "+ media);
	}
	
}