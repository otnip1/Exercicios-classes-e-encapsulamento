public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Parte 1 - Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        carro1.exibirInfo();
        carro2.exibirInfo();

        // Parte 2 - Lampada
        Lampada lampada = new Lampada("Branca");
        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();

        // Parte 3 - ContaBancaria
        ContaBancaria conta = new ContaBancaria("Maria");
        conta.depositar(1000.0);
        conta.sacar(300.0);
        conta.sacar(800.0); // tentativa de saque com saldo insuficiente
    }
}
