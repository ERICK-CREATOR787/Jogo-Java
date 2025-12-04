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

    // ----------- MÉTODO COM PROTEÇÃO DE VIDA -----------
    public void receberDano(int dano) {
        vida -= dano;

        // Garante que a vida nunca fique negativa
        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano! Vida atual: " + vida);
    }

    // ----------- DEFESA COM LIMITE DE ENERGIA -----------
    public void defender() {
        energia += 10;

        // Garante que a energia nunca ultrapasse 100
        if (energia > 100) {
            energia = 100;
        }

        System.out.println(nome + " defendeu e ganhou +10 de energia! Energia atual: " + energia);
    }

    // ----------- STATUS -----------
    public void mostrarStatus() {
        System.out.println("---- Status ----");
        System.out.println("Lutador: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("----------------");
    }

    // ----------- VIVO OU MORTO -----------
    public boolean estaVivo() {
        return vida > 0;
    }
}

