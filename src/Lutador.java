public abstract class Lutador {
    protected String nome;
    protected int vida;
    protected int energia;
    protected int forca;

    public Lutador(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

    public abstract void atacar(Lutador oponente);

    public abstract void especial(Lutador oponente);

    public void defender() {
        // defesa básica aumenta energia
        energia += 10;
        System.out.println(nome + " defendeu e ganhou +10 de energia!");
    }

    public void mostrarStatus() {
        System.out.println("---- Status ----");
        System.out.println("Lutador: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("----------------");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
