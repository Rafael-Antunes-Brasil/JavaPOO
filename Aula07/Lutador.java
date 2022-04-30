package Aula07;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    //construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    //metodos publicos
    public void apresentar(){
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos.");
        System.out.println(this.getAltura() + "m de altura.");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Empatou " + this.getEmpates());
        System.out.println("Perdeu " + this.getDerrotas());
    }
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if(this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
   
}
