public class LutadorLeve extends Lutador {

    public LutadorLeve(String nome) {
        super(nome, 80, 120, 15);
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

        // Aplica dano usando o método seguro
        System.out.println(nome + " atacou levemente! Dano: " + forca);
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
            System.out.println("O especial não pode ser realizado. O oponente já está sem vida!");
            return;
        }

        // Verifica energia suficiente
        if (energia >= 30) {
            int dano = forca + 20;

            System.out.println(nome + " usou ESPECIAL rápido! Dano: " + dano);

            // Deduz energia
            energia -= 30;

            // Garante que energia não fique negativa
            if (energia < 0) energia = 0;

            // Aplica dano seguro
            oponente.receberDano(dano);

        } else {
            System.out.println("Energia insuficiente para especial!");
        }
    }
}
