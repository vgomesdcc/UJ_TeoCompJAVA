import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner teste1 = new Scanner(System.in);
    System.out.println("Digite um numero:");
    int number = teste1.nextInt(); 
    
    if (number%2==0) {
      System.out.println("o numero e par");
    }

    else {
      System.out.println("o numero e impar");
    }
	}
} 
