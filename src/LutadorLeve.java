public class LutadorLeve extends Lutador {
    public LutadorLeve(String nome) {
        super(nome, 80, 120, 15);
    }

    @Override
    public void atacar(Lutador oponente) {
        oponente.vida -= this.forca;
        System.out.println(nome + " atacou levemente! Dano: " + forca);
    }

    @Override
    public void especial(Lutador oponente) {
        if (energia >= 30) {
            int dano = forca + 20;
            oponente.vida -= dano;
            energia -= 30;
            System.out.println(nome + " usou ESPECIAL rápido! Dano: " + dano);
        } else {
            System.out.println("⚠ Energia insuficiente para especial!");
        }
    }
}
