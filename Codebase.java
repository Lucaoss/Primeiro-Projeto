import java.util.Random;
import java.util.Scanner;

class code {
    public static void main(String[] args) {
        // Player
        Scanner scan = new Scanner(System.in);
        System.out.println("_______ JOKENPÔ _______");
        System.out.println("");
        System.out.println("Digite 1 Para Pedra");
        System.out.println("Digite 2 Para Papel");
        System.out.println("Digite 3 Para Tesoura");
        int opj = scan.nextInt();
        switch (opj) {
            case 1: {
                System.out.println("");
                System.out.println("Jogador escolheu Pedra");
                break;
            }
            case 2: {
                System.out.println("");
                System.out.print("Jogador escolheu Papel");
                break;
            }
            case 3: {
                System.out.println("");
                System.out.print("Jogador escolheu Tesoura");
                break;
            }
        }
        // BOT
        int botr;
        Random rd = new Random();
        botr = rd.nextInt(3) + 1;
        switch (botr) {
            case 1: {
                System.out.println("");
                System.out.print("Computador escolheu Pedra");

                break;
            }
            case 2: {
                System.out.println("");
                System.out.println("Computador escolheu Papel");

                break;
            }
            case 3: {
                System.out.println("");
                System.out.println("Computador escolheu Tesoura");

                break;
            }

            // Lógica de Resultados
        }
        if (opj == botr) {
            System.out.println(" \n EMPATE");
        } else {
            if (((opj == 1 && botr == 3) || opj == 2 && botr == 1) || opj == 3 && botr == 2) {

                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }
    }
}