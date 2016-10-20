package javaURI;
import java.util.Scanner;

public class Java1914 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String nome1, nome2;
		String escolha1, escolha2;
		int qtd, n1, n2, soma;
		
		qtd = scan.nextInt();
		
		for(int i = 0; i < qtd; i++){
			
			nome1 = scan.next();
			escolha1 = scan.next();
			
			nome2 = scan.next();
			escolha2 = scan.next();
			
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			soma = n1+n2;
			
			if( soma%2 == 0){
				if(escolha1.equalsIgnoreCase("par")) System.out.println(nome1);
				else if(escolha2.equalsIgnoreCase("par")) System.out.println(nome2);
			}else if( soma%2 != 0){
				if(escolha1.equalsIgnoreCase("impar")) System.out.println(nome1);
				else if(escolha2.equalsIgnoreCase("impar")) System.out.println(nome2);
			}
			
		}
		
		
	}

}
