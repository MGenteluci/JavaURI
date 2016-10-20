package javaURI;
import java.util.Scanner;

public class Java1983 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int qtd, i, escolhido = 0;
		double maior = 7.9;
		
		qtd = scan.nextInt();
		
		int[] mat = new int [qtd];
		double[] nota = new double [mat.length];
		
		for(i = 0; i < qtd; i++){
			
			mat[i] = scan.nextInt();
			nota[i] = scan.nextDouble();
			
			if(nota[i] > maior){
				maior = nota[i];
				escolhido = mat[i];
			}
			
		}
		
		if(maior >= 8)System.out.println(escolhido);
		else System.out.println("Minimum note not reached");
		
		
	}

}
