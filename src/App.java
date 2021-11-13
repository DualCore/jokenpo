import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("JoKenPô");
        System.out.println("");
        System.out.println("1. Papel - 2. Pedra - 3. Tesoura");
        // U(1) C(2) = -1 vencedor usuario
        // U(1) C(3) = -2 vencedor computador
        // U(2) C(1) = 1 vencedor computador
        // U(2) C(3) = -1 vencedor usuario
        // U(3) C(1) = 2 vencedor usuario
        // U(3) C(2) = 1 vencedor computador

        Random gerador = new Random();
        int numeroUsuario;
        int escolhaComputador;
        
        numeroUsuario = teclado.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1;

        switch(escolhaComputador) {
            case 1:
                System.out.println("Computador escolheu papel");
                break;
            case 2:
                System.out.println("Computador escolheu pedra");
                break;
            case 3:
                System.out.println("Computador escolheu tesoura");
                break;
        }

        
        if(numeroUsuario == escolhaComputador) {
            System.out.println("Empate");
        } else if((numeroUsuario - escolhaComputador) == -1 || (numeroUsuario - escolhaComputador) ==2) {
            System.out.println("O usuário é o vencedor");
        } else {
            System.out.println("O computador é o vencedor");
        }

        teclado.close();
    }
}
