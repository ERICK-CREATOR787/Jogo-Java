public class LutadorPesado extends Lutador {

    public LutadorPesado(String nome) {
        super(nome, 130, 80, 25);
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

        int dano = this.forca + 5;
        System.out.println(nome + " atacou fortemente! Dano: " + dano);
        oponente.receberDano(dano);
    }

    @Override
    public void especial(Lutador oponente) {

        // Verifica se o atacante está vivo
        if (!this.estaVivo()) {
            System.out.println(nome + " não pode usar o especial porque está sem vida!");
            return;
        }

        // Verifica se o oponente está vivo
        if (!oponente.estaVivo()) {
            System.out.println("O especial não pode ser realizado. O oponente já está sem vida!");
            return;
        }

        // Verifica energia suficiente
        if (energia >= 50) {
            int dano = forca + 45;

            System.out.println(nome + " usou GOLPE ESPECIAL PESADO! Dano: " + dano);

            energia -= 50;

            // evita energia negativa
            if (energia < 0) energia = 0;

            oponente.receberDano(dano);

        } else {
            System.out.println("Energia insuficiente para especial!");
        }
    }
}
