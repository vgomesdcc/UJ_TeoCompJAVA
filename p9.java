import java.util.Scanner;

class Main {
	public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o tempo em segundos:");
  int s = entrada.nextInt();  
    
  int horas,minutos,segundos, resto;

  horas = s/3600;
  resto = s%3600;

  minutos = resto/60;
	segundos = resto%60;

  System.out.println("Hora(s): "+horas+", Minuto(s): "+minutos+", Segundos: "+segundos);

  }
} 
