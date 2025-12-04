public class LutadorMedio extends Lutador {

    public LutadorMedio(String nome) {
        super(nome, 100, 100, 20);
    }

    @Override
    public void atacar(Lutador oponente) {

        // Verifica se o atacante está vivo
        if (!this.estaVivo()) {
            System.out.println(nome + " não pode atacar porque está sem vida!");
            return;
        }

        // Verifica se o oponente está vivo
        if (!oponente.estaVivo()) {
            System.out.println("O ataque não pode ser realizado. O oponente já está sem vida!");
            return;
        }

        // Executa ataque
        System.out.println(nome + " atacou! Dano: " + forca);
        oponente.receberDano(this.forca);
    }

    @Override
    public void especial(Lutador oponente) {

        // Verifica se o atacante está vivo
        if (!this.estaVivo()) {
            System.out.println(nome + " não pode usar especial porque está sem vida!");
            return;
        }

        // Verifica se o oponente está vivo
        if (!oponente.estaVivo()) {
            System.out.println("O especial não pode ser usado. O oponente já está sem vida!");
            return;
        }

        // Verifica energia suficiente
        if (energia >= 40) {
            int dano = forca + 30;

            System.out.println(nome + " usou ESPECIAL balanceado! Dano: " + dano);

            energia -= 40;

            // Evita energia negativa
            if (energia < 0) energia = 0;

            oponente.receberDano(dano);

        } else {
            System.out.println("⚠ Energia insuficiente para especial!");
        }
    }
}
