import java.util.Scanner;

class Main {
	public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o custo:");
  double custo = entrada.nextDouble();  
    
  double distribuidor = custo*0.28;
  double imposto = custo*0.45;

  double consumidorpaga =  custo+distribuidor+imposto;

  System.out.println("O consumidor paga:"+consumidorpaga+" reais");
  }
} 
