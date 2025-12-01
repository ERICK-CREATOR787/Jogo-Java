//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        Lutador[] lutadores = new Lutador[2];

        for (int i = 0; i < lutadores.length; i++) {
            System.out.print("Digite o nome do lutador " + (i+1) + ": ");
            String nome = scan.nextLine();

            System.out.print("Escolha o tipo (1-Leve, 2-Médio, 3-Pesado): ");
            int tipo = scan.nextInt();
            scan.nextLine();

            if (tipo == 1) lutadores[i] = new LutadorLeve(nome);
            else if (tipo == 2) lutadores[i] = new LutadorMedio(nome);
            else lutadores[i] = new LutadorPesado(nome);
        }

        System.out.println("\n--- INÍCIO DA LUTA ---");
        lutadores[0].mostrarStatus();
        lutadores[1].mostrarStatus();

        while (lutadores[0].estaVivo() && lutadores[1].estaVivo()) {
            System.out.println("\nSua vez! Escolha sua ação:");
            System.out.println("1 - Ataque normal");
            System.out.println("2 - Especial");
            System.out.println("3 - Defesa");

            int acao = scan.nextInt();

            if (acao == 1) lutadores[0].atacar(lutadores[1]);
            else if (acao == 2) lutadores[0].especial(lutadores[1]);
            else lutadores[0].defender();

            if (!lutadores[1].estaVivo()) break;

            int acaoOponente = random.nextInt(3) + 1;
            System.out.println("\nOponente está jogando...");

            if (acaoOponente == 1) lutadores[1].atacar(lutadores[0]);
            else if (acaoOponente == 2) lutadores[1].especial(lutadores[0]);
            else lutadores[1].defender();

            lutadores[0].mostrarStatus();
            lutadores[1].mostrarStatus();
        }

        System.out.println("\n🏆 Fim da luta! Vencedor: ");
        if (lutadores[0].estaVivo()) System.out.println(lutadores[0].nome);
        else System.out.println(lutadores[1].nome);

        scan.close();
    }
}