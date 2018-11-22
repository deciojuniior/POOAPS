package POOAPS.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    int status;
    int tempo;

    List<Pessoa> pessoas = new ArrayList<>();

    public Pessoa(int valormax, int valormin){
        this.tempo = valormin + (int)(Math.random()*valormax);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public int geraTempo(int valorMin, int valorMax){
        tempo=valorMin + (int) (Math.random() * valorMax);
        return tempo;
    }

    public void comer(){
        tempo --;
    }


}
