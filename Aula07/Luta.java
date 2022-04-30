package Aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l2;
            this.desafiante = l1;
            System.out.println("Luta aprovada, façam suas apostas!!!!");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("Ladies and Gentleman");
            System.out.println("Com vocês essa noite!");
            System.out.println("--- DESAFIADO  ---");
            this.desafiado.apresentar();
            System.out.println("--- DESAFIANTE ---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                System.out.println("===================");
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: //Desafiado vence
                System.out.println("===================");
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("===================");
                break;
                case 2: //Desafiante vence
                System.out.println("===================");
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}
