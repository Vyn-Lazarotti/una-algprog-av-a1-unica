import java.util.*;

public class sentinela {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, cargo;
        int acesso, sigilo;

        System.out.println("--- SISTEMA SENTINELA ---");
        System.out.println("Loading...");

        System.out.println("\nInsira o nome: ");
        nome = teclado.nextLine();
        System.out.println("\nInsira o cargo: ");
        cargo = teclado.next();
        System.out.println("\nInsira o nível de acesso (1-10): ");
        acesso = teclado.nextInt();
        System.out.println("\nInsira o nível de sigilo que deseja acessar (1-10):");
        sigilo = teclado.nextInt();

        if (acesso < 3 && sigilo > 7) {
            System.out.println(nome + " (" + cargo + ")" + " - ACESSO NEGADO!");
            System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
        } else if (acesso < 1 || acesso > 10) {
            System.out.println("Erro: Nível de acesso inválido.");
        } else {
            System.out.println(nome + " (" + cargo + ")" + " - ACESSO PERMITIDO!");
            System.out.println("Nível de autoridade: " + sigilo);
        }

        teclado.close();
    }
}