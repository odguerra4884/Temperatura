
package com.edu.gt.dto;


public class Temperatura {

    private String cuidate;
    private int minima;
    private int maxima;

    public Temperatura(String cuidate, int minima, int maxima) {
        this.cuidate = cuidate;
        this.minima = minima;
        this.maxima = maxima;
    }

    public Temperatura(String cuidate) {
        this.cuidate = cuidate;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "cuidate=" + cuidate + ", minima=" + minima + ", maxima=" + maxima + '}';
    }

    public String getCuidate() {
        return cuidate;
    }

    public void setCuidate(String cuidate) {
        this.cuidate = cuidate;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

}
