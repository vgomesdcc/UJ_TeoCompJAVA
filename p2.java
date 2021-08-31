import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    Scanner digito1 = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    int num1 = digito1.nextInt();  

    Scanner digito2 = new Scanner(System.in);
    System.out.println("Digite o segundo numero:");  
    int num2 = digito2.nextInt();   
    
    if (num1==num2) {
      System.out.println("os numeros sao iguais");
    }

    else if(num1>num2){
      System.out.println(num1);
    }
    
    else {
      System.out.println(num2);
    }
	}
} 
