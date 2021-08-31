import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner teste1 = new Scanner(System.in);
    System.out.println("Digite a nota da primeira prova:");
    int prova1 = teste1.nextInt();  

    Scanner teste2 = new Scanner(System.in);
    System.out.println("Digite a nota da segunda prova:");  
    int prova2 = teste2.nextInt();   

    Scanner trab = new Scanner(System.in);
    System.out.println("Digite a nota do trabalho:");  
    int trabalho = trab.nextInt();  
    
    if (((prova1*3)+(prova2*3)+trabalho)/7>=7) {
      System.out.println("Aprovado");
    }

    else {
      System.out.println("Reprovado");
    }
	}
} 
