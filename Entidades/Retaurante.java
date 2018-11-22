package POOAPS.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Retaurante {


    public int matriz[][] = new int [7][3];


    public List fila = new ArrayList();
    public List bandeja = new ArrayList();
    public List caixa = new ArrayList();
    public List pratos = new ArrayList();
    public List salada = new ArrayList();
    public List carboidrato = new ArrayList();
    public List proteina = new ArrayList();
    public List suco = new ArrayList();


    public List getFila() {
        return fila;
    }

    public void setFila(List fila) {
        this.fila = fila;
    }

    public List getBandeja() {
        return bandeja;
    }

    public void setBandeja(List bandeja) {
        this.bandeja = bandeja;
    }

    public List getCaixa() {
        return caixa;
    }

    public void setCaixa(List caixa) {
        this.caixa = caixa;
    }

    public List getPratos() {
        return pratos;
    }

    public void setPratos(List pratos) {
        this.pratos = pratos;
    }

    public List getSalada() {
        return salada;
    }

    public void setSalada(List salada) {
        this.salada = salada;
    }

    public List getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(List carboidrato) {
        this.carboidrato = carboidrato;
    }

    public List getProteina() {
        return proteina;
    }

    public void setProteina(List proteina) {
        this.proteina = proteina;
    }

    public List getSuco() {
        return suco;
    }

    public void setSuco(List suco) {
        this.suco = suco;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
