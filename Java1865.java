package javaURI;
import java.util.Scanner;

public class Java1865 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtd;
		
		qtd = scan.nextInt();
		
		String nome;
		int forca, i;
		
		for(i = 0; i < qtd; i++){
	
			nome = scan.next();
			forca = scan.nextInt();
			
			if(nome.equalsIgnoreCase("Thor")){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}
			
			
		}
		
	}

}
