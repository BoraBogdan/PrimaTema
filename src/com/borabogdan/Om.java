package com.borabogdan;

public class Om {
    private double inaltime;
    private String nume;
    private Buletin buletin;

    public Om() {
    }

    public Om(double inaltime, String nume, Buletin buletin) {
        this.inaltime = inaltime;
        this.nume = nume;
        this.buletin = buletin;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Buletin getBuletin() {
        return buletin;
    }

    public void setBuletin(Buletin buletin) {
        this.buletin = buletin;
    }

    @Override
    public String toString() {
        return "Omul " + nume +
                " cu inaltimea de " + inaltime +
                " are buletinul: " + buletin;
    }
}