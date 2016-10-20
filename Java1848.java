package javaURI;
import java.util.Scanner;

public class Java1848 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String resp;
		int cont = 0, soma = 0;
		
		while(cont < 3){
			
			resp = scan.nextLine();
			
			if(resp.equals("---")){
				soma += 0;
			}else if(resp.equals("--*")){
				soma += 1;
			}else if(resp.equals("-*-")){
				soma += 2;
			}else if(resp.equals("-**")){
				soma += 3;
			}else if(resp.equals("*--")){
				soma += 4;
			}else if(resp.equals("*-*")){
				soma += 5;
			}else if(resp.equals("**-")){
				soma += 6;
			}else if(resp.equals("***")){
				soma += 7;
			}else if(resp.equalsIgnoreCase("caw caw")){
				System.out.println(soma);
				cont++;
				soma = 0;
			}
			
		}
		
	}

}
