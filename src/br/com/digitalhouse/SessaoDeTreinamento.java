package br.com.digitalhouse;

public class SessaoDeTreinamento {
    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA (JogadorDeFutebol jogadorNome){

        jogadorNome.correr();
        jogadorNome.fazerGol();
        jogadorNome.correr();

        System.out.println("EXPERIENCIA ANTES DO TREINO: " + jogadorNome.getExperiencia());

        jogadorNome.setExperiencia(jogadorNome.getExperiencia()+1);

        System.out.println("EXPERIENCIA DEPIOS DO TREINO: " + jogadorNome.getExperiencia());

    }




}
