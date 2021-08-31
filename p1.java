import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner digito = new Scanner(System.in);
    System.out.println("Digite a sua temperatura:");

		int temp = digito.nextInt();   
    
    if (temp>37) {
      System.out.println("O paciente esta com febre");
    }
    
    else {
      System.out.println("A temperatura do paciente esta normal");
    }
	}
} 
