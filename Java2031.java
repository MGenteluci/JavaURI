package javaURI;
import java.util.Scanner;

public class Java2031 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String escolha1, escolha2;
		int qtd, i;
		
		qtd = scan.nextInt();
		
		for(i = 0; i < qtd; i++){
			
			escolha1 = scan.next();
			escolha2 = scan.next();
			
			if(escolha1.equalsIgnoreCase("ataque")){
				if(escolha2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
				else if(escolha2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
				else if(escolha2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");

			}else if(escolha1.equalsIgnoreCase("pedra")){
				if(escolha2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
				else if(escolha2.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");
				else if(escolha2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");

			}else if(escolha1.equalsIgnoreCase("papel")){
				if(escolha2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
				else if(escolha2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");
				else if(escolha2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");

			}
			
		}
		
	}
	
}
