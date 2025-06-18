public class Lampada {
    private String cor;
    private boolean ligada;

    public Lampada(String cor) {
        this.cor = cor;
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada " + cor + " está ligada.");
        } else {
            System.out.println("A lâmpada " + cor + " está desligada.");
        }
    }
}
