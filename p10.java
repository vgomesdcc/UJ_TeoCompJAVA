import java.util.Scanner;

class Main {
	public static void main(String[] args) {
  String program = "programador";

  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o seu cargo:");
  String cargo = entrada.nextLine(); 

  Scanner entrada2 = new Scanner(System.in);
  System.out.println("Digite o seu salario:");
  double salario = entrada2.nextDouble();   
    
    if(cargo.equals(program)){
      salario = salario+(salario*0.30);
      System.out.println("Seu novo salario e de: "+salario);
    }

    else{
      salario = salario+(salario*0.10);
      System.out.println("Seu novo salario e de: "+salario);
    }
  }
} 
