package br.com.digitalhouse;

public class Exercicio2 {

    public static void main(String[] args) {

        JogadorDeFutebol jogadorA = new JogadorDeFutebol();
        jogadorA.setNome("RONALDO");
        jogadorA.setEnergia(50);
        jogadorA.setAlegria(100);
        jogadorA.setGols(100);
        jogadorA.setExperiencia(100);

        JogadorDeFutebol jogadorB = new JogadorDeFutebol();
        jogadorB.setNome("MESSI");
        jogadorB.setEnergia(100);
        jogadorB.setAlegria(100);
        jogadorB.setGols(100);
        jogadorB.setExperiencia(200);

        SessaoDeTreinamento treinar = new SessaoDeTreinamento();
        treinar.treinarA(jogadorA);
        treinar.treinarA(jogadorB);

    }



}
