package Aula05;

public class Pessoa {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(0001);
        pessoa1.setDono("Rafael");
        pessoa1.abriConta("CC");
        pessoa1.depositar(300);
        pessoa1.estadoAtual();

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(0002);
        pessoa2.setDono("Thaís");
        pessoa2.abriConta("CP");
        pessoa2.sacar(100);
        pessoa2.estadoAtual();
    }
}