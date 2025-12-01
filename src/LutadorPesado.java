public class LutadorPesado extends Lutador {
    public LutadorPesado(String nome) {
        super(nome, 130, 80, 25);
    }

    @Override
    public void atacar(Lutador oponente) {
        oponente.vida -= this.forca + 5;
        System.out.println(nome + " atacou fortemente! Dano: " + (forca + 5));
    }

    @Override
    public void especial(Lutador oponente) {
        if (energia >= 50) {
            int dano = forca + 45;
            oponente.vida -= dano;
            energia -= 50;
            System.out.println(nome + " usou GOLPE ESPECIAL PESADO! Dano: " + dano);
        } else {
            System.out.println("⚠ Energia insuficiente para especial!");
        }
    }
}
