public class LutadorMedio extends Lutador {
    public LutadorMedio(String nome) {
        super(nome, 100, 100, 20);
    }

    @Override
    public void atacar(Lutador oponente) {
        oponente.vida -= this.forca;
        System.out.println(nome + " atacou! Dano: " + forca);
    }

    @Override
    public void especial(Lutador oponente) {
        if (energia >= 40) {
            int dano = forca + 30;
            oponente.vida -= dano;
            energia -= 40;
            System.out.println(nome + " usou ESPECIAL balanceado! Dano: " + dano);
        } else {
            System.out.println("⚠ Energia insuficiente para especial!");
        }
    }
}
