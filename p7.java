import java.util.Scanner;

class Main {
	public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite seu salario:");
  double salario = entrada.nextDouble();  
    
    if(salario<=1903.98){
		System.out.println("Seu salario liquido e R$"+salario+", voce esta insento do imposto\n");
  	}

    else if(salario>=1903.99 && salario <=2826.65){
    salario = salario-(salario*0.075);
		System.out.println("Seu salario liquido e R$"+salario+", voce foi tributado em 7.5%\n");
  	}

    else if(salario>=2826.66 && salario <=3751.05){
    salario = salario-(salario*0.15);
		System.out.println("Seu salario liquido e R$"+salario+", voce foi tributado em 15%\n");
  	}

    else if(salario>=3751.06 && salario <=4664.68){
    salario = salario-(salario*0.225);
		System.out.println("Seu salario liquido e R$"+salario+", voce foi tributado em 22.5%\n");
    }

    else if(salario>=4664.69){
    salario = salario-(salario*0.275);
		System.out.println("Seu salario liquido e R$"+salario+", voce foi tributado em 27.5%\n");
    }
  }
} 
