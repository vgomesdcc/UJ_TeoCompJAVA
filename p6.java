import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner teste1 = new Scanner(System.in);
    System.out.println("Digite seu peso:");
    float peso = teste1.nextFloat();  

    Scanner teste2 = new Scanner(System.in);
    System.out.println("Digite sua altura:");  
    float altura = teste2.nextFloat(); 

    float imc = peso/(altura*altura);
    
    if (imc>30) {
      System.out.println("O usuario esta obeso");
    }

    else {
      System.out.println("O usuario esta abaixo da linha de obesidade");
    }
	}
} 
