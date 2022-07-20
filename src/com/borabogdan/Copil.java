package com.borabogdan;

import static com.borabogdan.PrintColor.ANSI_GREEN;

public class Copil extends Om{
    private double greutate;


    public Copil(double greutate, double inaltime, String nume, Buletin buletin) {
        super(inaltime, nume, buletin);
        this.greutate = greutate;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return  ANSI_GREEN +
                "Copilul are o greutate de(kg): " +
                greutate + "\n" + super.toString() + "\n";
    }
}
