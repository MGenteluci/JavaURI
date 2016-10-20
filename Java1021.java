package javaURI;
import java.util.Scanner;

public class Java1021 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0;
		double m1 = 0, m05 = 0, m025 = 0, m010 = 0, m005 = 0, m001 = 0;
		double total, centavos;
		
		total = scan.nextDouble();
		centavos = total*100;
		
			n100 = total/100;
			total = total%100;		


			n50 = total/50;
			total = total%50;		


			n20 = total/20;
			total = total%20;


			n10 = total/10;
			total = total%10;


			n5 = total/5;
			total = total%5;


			n2 = total/2;
			total = total%2;
			
			m1 = total/1;
			total = total%1;

		centavos = centavos % 100;
		
        m05 = centavos / 50;
        centavos %= 50;
        
        m025 = centavos / 25;
        centavos %= 25;
        
        m010 = centavos / 10;
        centavos %= 10;
        
        m005 = centavos / 5;
        centavos %= 5;
        
        m001 = centavos;

		
		System.out.println("NOTAS:");
		System.out.println((int)n100 + " nota(s) de R$ 100.00");
		System.out.println((int)n50 + " nota(s) de R$ 50.00");
		System.out.println((int)n20 + " nota(s) de R$ 20.00");
		System.out.println((int)n10 + " nota(s) de R$ 10.00");
		System.out.println((int)n5 + " nota(s) de R$ 5.00");
		System.out.println((int)n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int)m1 + " moeda(s) de R$ 1.00");
		System.out.println((int)m05 + " moeda(s) de R$ 0.50");
		System.out.println((int)m025 + " moeda(s) de R$ 0.25");
		System.out.println((int)m010 + " moeda(s) de R$ 0.10");
		System.out.println((int)m005 + " moeda(s) de R$ 0.05");
		System.out.println((int)m001 + " moeda(s) de R$ 0.01");

	}

}
