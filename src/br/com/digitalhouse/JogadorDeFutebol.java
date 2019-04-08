package br.com.digitalhouse;

public class JogadorDeFutebol {

    public String nome;
    public int energia;
    public int alegria;
    public int gols;
    public int experiencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGol(){
        energia = energia - 5;
        alegria = alegria + 10;
        gols = gols + 1;

        System.out.println("GOOOOOLLLL!!!!");
    }

    public void correr(){
        energia = energia - 10;

        System.out.println("CANSEI...");
    }



}
