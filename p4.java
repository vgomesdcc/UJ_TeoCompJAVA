import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner teste1 = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    int numerador = teste1.nextInt();  

    Scanner teste2 = new Scanner(System.in);
    System.out.println("Digite o segundo numero:");  
    int denominador = teste2.nextInt();   
    
    if (numerador%denominador==0) {
      System.out.println("Divisores perfeitos");
    }

    else {
      System.out.println("Nao sao divisores perfeitos");
    }
	}
} 
